package com.Portfolio.YoProgramoValdez.controller;

import com.Portfolio.YoProgramoValdez.DTO.Mensaje;
import com.Portfolio.YoProgramoValdez.entity.Educacion;
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

    @GetMapping("/datos")
    public ResponseEntity<List<Persona>> getDatosPersona(){
        List<Persona> lista = personaService.getList();
        return new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
    }

    @PutMapping("/editar")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Persona> editar(@RequestBody Persona persona){
        Persona editarPersona = personaService.editarPersona(persona);
        return new ResponseEntity<>(editarPersona, HttpStatus.OK);
    }


}
