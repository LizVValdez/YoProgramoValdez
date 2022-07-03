package com.Portfolio.YoProgramoValdez.service;

import com.Portfolio.YoProgramoValdez.entity.Experiencia;
import com.Portfolio.YoProgramoValdez.entity.Habilidad;
import com.Portfolio.YoProgramoValdez.repository.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class HabilidadService {

    @Autowired

    HabilidadRepository habilidadRepository;

    public List<Habilidad> getList(){
        return habilidadRepository.findAll();
    }

    public Optional<Habilidad> getHabilidadId(long id){
        return habilidadRepository.findById(id);
    }

    public void save(Habilidad habilidad){
        habilidadRepository.save(habilidad);
    }

    public void delete(long id){
        habilidadRepository.deleteById(id);
    }

    public boolean existsHabilidadId(long id){ return habilidadRepository.existsById(id); }
    public Habilidad editarHabilidad(Habilidad habilidad){
        return habilidadRepository.save(habilidad);
    }
}