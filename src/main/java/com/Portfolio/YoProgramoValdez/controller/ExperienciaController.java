package com.Portfolio.YoProgramoValdez.controller;

import com.Portfolio.YoProgramoValdez.DTO.Mensaje;
import com.Portfolio.YoProgramoValdez.entity.Experiencia;
import com.Portfolio.YoProgramoValdez.service.ExperienciaService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

public class ExperienciaController {

    @Autowired
    ExperienciaService experienciaService;
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> getListaExperiencia(){
        List<Experiencia> lista = experienciaService.getList();
        return new ResponseEntity<List<Experiencia>>(lista, HttpStatus.OK);
    }

    @PostMapping("/nueva")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> create(@RequestBody Experiencia experiencia){
        if(StringUtils.isBlank(experiencia.getTituloExperiencia()))
            return new ResponseEntity(new Mensaje("El Título es Obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(experiencia.getInstitucionExperiencia()))
            return new ResponseEntity(new Mensaje("La Institución es Obligatoria"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(experiencia.getTiempoExperiencia()))
            return new ResponseEntity(new Mensaje("El Período Trabajado es Obligatorio"), HttpStatus.BAD_REQUEST);
        experienciaService.save(experiencia);
        return new ResponseEntity(new Mensaje("Nueva Experiencia Agregada"), HttpStatus.CREATED);
    }
    @PutMapping("/editar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> update(@RequestBody Experiencia experiencia, @PathVariable("id") Long id){
        if(!experienciaService.existsExperienciaId(id))
            return new ResponseEntity(new Mensaje("La Experiencia Indicada No Existe"), HttpStatus.NOT_FOUND);
        if(StringUtils.isBlank(experiencia.getTituloExperiencia()))
            return new ResponseEntity(new Mensaje("El Título es Obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(experiencia.getInstitucionExperiencia()))
            return new ResponseEntity(new Mensaje("La Institución es Obligatoria"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(experiencia.getTiempoExperiencia()))
            return new ResponseEntity(new Mensaje("El Período Trabajado es Obligatorio"), HttpStatus.BAD_REQUEST);

        Experiencia expUpdate = experienciaService.getExperienciaId(id).get();
        expUpdate.setTituloExperiencia(experiencia.getTituloExperiencia());
        expUpdate.setInstitucionExperiencia(experiencia.getInstitucionExperiencia());
        expUpdate.setTiempoExperiencia(experiencia.getTiempoExperiencia());
        expUpdate.setUrlExperiencia(experiencia.getUrlExperiencia());

        experienciaService.save(expUpdate);
        return new ResponseEntity(new Mensaje("La Experiencia fue Actualizada"), HttpStatus.CREATED);
    }
    @DeleteMapping("/borrar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(!experienciaService.existsExperienciaId(id))
            return new ResponseEntity(new Mensaje("No Existe la Experiencia Indicada"), HttpStatus.NOT_FOUND);
        experienciaService.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia Eliminada"), HttpStatus.OK);
    }
}