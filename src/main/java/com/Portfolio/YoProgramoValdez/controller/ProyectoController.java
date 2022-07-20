package com.Portfolio.YoProgramoValdez.controller;

import com.Portfolio.YoProgramoValdez.DTO.Mensaje;
import com.Portfolio.YoProgramoValdez.entity.Proyecto;
import com.Portfolio.YoProgramoValdez.service.ProyectoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {

    @Autowired
    ProyectoService proyectoService;

    @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>> getListaProyectos(){
        List<Proyecto> lista = proyectoService.getList();
        return new ResponseEntity<List<Proyecto>>(lista, HttpStatus.OK);
    }
    @PostMapping("/nuevo")
    public ResponseEntity<?> create(@RequestBody Proyecto proyecto){
        if(StringUtils.isBlank(proyecto.getNombreProyecto()))
            return new ResponseEntity(new Mensaje("El Nombre del Proyecto es Obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(proyecto.getUrlProyecto()))
            return new ResponseEntity(new Mensaje("La Imagen del Proyecto es Obligatoria"), HttpStatus.BAD_REQUEST);
        proyectoService.save(proyecto);
        return new ResponseEntity(new Mensaje("Nueva Proyecto Agregado"), HttpStatus.CREATED);
    }
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@RequestBody Proyecto proyecto, @PathVariable("id") Long id){
        if(!proyectoService.existsProyectoId(id))
            return new ResponseEntity(new Mensaje("No Existe el Proyecto Indicado"), HttpStatus.NOT_FOUND);
        if(StringUtils.isBlank(proyecto.getNombreProyecto()))
            return new ResponseEntity(new Mensaje("El Nombre del Proyecto es Obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(proyecto.getUrlProyecto()))
            return new ResponseEntity(new Mensaje("La Imagen del Proyecto es Obligatoria"), HttpStatus.BAD_REQUEST);
        Proyecto proyUpdate = proyectoService.getProyectoId(id).get();
        proyUpdate.setNombreProyecto(proyecto.getNombreProyecto());
        proyUpdate.setUrlProyecto(proyecto.getUrlProyecto());
        proyectoService.save(proyUpdate);
        return new ResponseEntity(new Mensaje("Proyecto Actualizado"), HttpStatus.CREATED);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(!proyectoService.existsProyectoId(id))
            return new ResponseEntity(new Mensaje("No Existe el Proyecto Indicado"), HttpStatus.NOT_FOUND);
        proyectoService.delete(id);
        return new ResponseEntity(new Mensaje("Proyecto Eliminado"), HttpStatus.OK);
    }
}