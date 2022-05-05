package com.Portfolio.YoProgramoValdez.controller;

import com.Portfolio.YoProgramoValdez.DTO.Mensaje;
import com.Portfolio.YoProgramoValdez.entity.Encabezado;
import com.Portfolio.YoProgramoValdez.service.EncabezadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encabezado")
@CrossOrigin(origins = "http://localhost:4200")

public class EncabezadoController {

    @Autowired
    EncabezadoService encabezadoService;

    @GetMapping("/imagenes")
    public ResponseEntity<List<Encabezado>> getImagenesEncabezado(){
        List<Encabezado> lista = encabezadoService.getList();
        return new ResponseEntity<List<Encabezado>>(lista, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@RequestBody Encabezado encabezado, @PathVariable("id") Long id){

        Encabezado encUpdate = encabezadoService.getEncabezadoId(id).get();
        encUpdate.setUrlArgPrograma(encabezado.getUrlArgPrograma());
        encUpdate.setUrlBanner(encabezado.getUrlBanner());
        encUpdate.setUrlEmail(encabezado.getUrlEmail());
        encUpdate.setUrlFacebook(encabezado.getUrlFacebook());
        encUpdate.setUrlGithub(encabezado.getUrlGithub());

        encabezadoService.save(encUpdate);

        return new ResponseEntity(new Mensaje("Imagenes Actualizadas"), HttpStatus.CREATED);
    }
}