package com.Portfolio.YoProgramoValdez.service;

import com.Portfolio.YoProgramoValdez.entity.Experiencia;
import com.Portfolio.YoProgramoValdez.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ExperienciaService {

    @Autowired
    ExperienciaRepository experienciaRepository;

    public List<Experiencia> getList(){
        return experienciaRepository.findAll();
    }

    public Optional<Experiencia> getExperienciaId(long id){
        return experienciaRepository.findById(id);
    }

    public void save(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }

    public void delete(long id){
        experienciaRepository.deleteById(id);
    }

    public boolean existsExperienciaId(long id){
        return experienciaRepository.existsById(id);
    }

}