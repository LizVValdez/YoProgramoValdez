package com.Portfolio.YoProgramoValdez.service;

import com.Portfolio.YoProgramoValdez.entity.Persona;
import com.Portfolio.YoProgramoValdez.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> getList(){
        return personaRepository.findAll();
    }

    public Optional<Persona> getPersonaId(long id){
        return personaRepository.findById(id);
    }

    public void save(Persona persona){
        personaRepository.save(persona);
    }

    public void delete(long id){
        personaRepository.deleteById(id);
    }

    public boolean existsPersonaId(long id){
        return personaRepository.existsById(id);
    }

}