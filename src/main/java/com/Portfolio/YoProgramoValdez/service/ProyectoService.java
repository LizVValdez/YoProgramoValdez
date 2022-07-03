package com.Portfolio.YoProgramoValdez.service;

import com.Portfolio.YoProgramoValdez.entity.Experiencia;
import com.Portfolio.YoProgramoValdez.entity.Proyecto;
import com.Portfolio.YoProgramoValdez.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProyectoService {

    @Autowired
    ProyectoRepository proyectoRepository;

    public List<Proyecto> getList(){
        return proyectoRepository.findAll();
    }

    public Optional<Proyecto> getProyectoId(long id){
        return proyectoRepository.findById(id);
    }

    public void save(Proyecto proyecto){
        proyectoRepository.save(proyecto);
    }

    public void delete(long id){
        proyectoRepository.deleteById(id);
    }

    public boolean existsProyectoId(long id){
        return proyectoRepository.existsById(id);
    }

    public Proyecto editarProyecto(Proyecto proyecto){
        return proyectoRepository.save(proyecto);
    }
}