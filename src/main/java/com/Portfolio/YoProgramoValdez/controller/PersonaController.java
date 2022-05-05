package com.Portfolio.YoProgramoValdez.controller;

import com.Portfolio.YoProgramoValdez.DTO.Mensaje;
import com.Portfolio.YoProgramoValdez.entity.Persona;
import com.Portfolio.YoProgramoValdez.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")

public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/atributos")
    public ResponseEntity<List<Persona>> getAtributosPersona(){
        List<Persona> lista = personaService.getList();
        return new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> update(@RequestBody Persona persona, @PathVariable("id") Long id){

        Persona persUpdate = personaService.getPersonaId(id).get();
        persUpdate.setAcercaDe(persona.getAcercaDe());
        persUpdate.setNombre(persona.getNombre());
        persUpdate.setUrlPerfil(persona.getUrlPerfil());
        persUpdate.setTitulo(persona.getTitulo());

        personaService.save(persUpdate);
        return new ResponseEntity(new Mensaje("Datos Actualizados"), HttpStatus.CREATED);
    }

}
