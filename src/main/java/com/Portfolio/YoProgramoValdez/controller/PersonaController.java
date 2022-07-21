package com.Portfolio.YoProgramoValdez.controller;

import com.Portfolio.YoProgramoValdez.entity.Persona;
import com.Portfolio.YoProgramoValdez.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*")

public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/datos")
    public ResponseEntity<List<Persona>> getDatosPersona(){
        List<Persona> lista = personaService.getList();
        return new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
    }

    @PutMapping("/editar")
    public ResponseEntity<Persona> editar(@RequestBody Persona persona){
        Persona editarDatos = personaService.editarDatos(persona);
        return new ResponseEntity<>(editarDatos, HttpStatus.OK);
    }
}