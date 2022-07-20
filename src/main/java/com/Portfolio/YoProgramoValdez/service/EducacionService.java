package com.Portfolio.YoProgramoValdez.service;

import com.Portfolio.YoProgramoValdez.entity.Educacion;
import com.Portfolio.YoProgramoValdez.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EducacionService {

    @Autowired
    EducacionRepository educacionRepository;

    public List<Educacion> getList(){
        return educacionRepository.findAll();
    }

    public Optional<Educacion> getEducacionId(long id){
        return educacionRepository.findById(id);
    }

    public void save(Educacion educacion){
        educacionRepository.save(educacion);
    }

    public void delete(long id){
        educacionRepository.deleteById(id);
    }

    public boolean existsEducacionId(long id){
        return educacionRepository.existsById(id);
    }

    public Educacion editarEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
}