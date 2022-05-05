package com.Portfolio.YoProgramoValdez.controller;

import com.Portfolio.YoProgramoValdez.DTO.Mensaje;
import com.Portfolio.YoProgramoValdez.entity.Educacion;
import com.Portfolio.YoProgramoValdez.service.EducacionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")

public class EducacionController {

    @Autowired
    EducacionService educacionService;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> getListaEducacion(){
        List<Educacion> lista = educacionService.getList();
        return new ResponseEntity<List<Educacion>>(lista, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/nueva")
    public ResponseEntity<?> create(@RequestBody Educacion educacion){
        if(StringUtils.isBlank(educacion.getTituloEducacion()))
            return new ResponseEntity(new Mensaje("El Título es Obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(educacion.getInstitucionEducacion()))
            return new ResponseEntity(new Mensaje("La Institución es Obligatoria"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(educacion.getTiempoEducacion()))
            return new ResponseEntity(new Mensaje("El Período Cursado es Obligatorio"), HttpStatus.BAD_REQUEST);
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("Nueva Campo Agregado en Educación"), HttpStatus.CREATED);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@RequestBody Educacion educacion, @PathVariable("id") Long id){
        if(!educacionService.existsEducacionId(id))
            return new ResponseEntity(new Mensaje("No Existe este Campo"), HttpStatus.NOT_FOUND);
        if(StringUtils.isBlank(educacion.getTituloEducacion()))
            return new ResponseEntity(new Mensaje("El Titulo es Obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(educacion.getInstitucionEducacion()))
            return new ResponseEntity(new Mensaje("La Institución es Obligatoria"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(educacion.getTiempoEducacion()))
            return new ResponseEntity(new Mensaje("El Período Cursado es Obligatorio"), HttpStatus.BAD_REQUEST);

        Educacion educUpdate = educacionService.getEducacionId(id).get();
        educUpdate.setTituloEducacion(educacion.getTituloEducacion());
        educUpdate.setInstitucionEducacion(educacion.getInstitucionEducacion());
        educUpdate.setTiempoEducacion(educacion.getTiempoEducacion());
        educUpdate.setUrlEducacion(educacion.getUrlEducacion());

        educacionService.save(educUpdate);
        return new ResponseEntity(new Mensaje("Campo Actualizado"), HttpStatus.CREATED);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(!educacionService.existsEducacionId(id))
            return new ResponseEntity(new Mensaje("No Existe el Campo Indicado"), HttpStatus.NOT_FOUND);
        educacionService.delete(id);
        return new ResponseEntity(new Mensaje("Campo Eliminado"), HttpStatus.OK);
    }
}