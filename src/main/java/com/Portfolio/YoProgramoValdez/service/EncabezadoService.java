package com.Portfolio.YoProgramoValdez.service;

import com.Portfolio.YoProgramoValdez.entity.Educacion;
import com.Portfolio.YoProgramoValdez.entity.Encabezado;
import com.Portfolio.YoProgramoValdez.repository.EncabezadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EncabezadoService {

    @Autowired
    EncabezadoRepository encabezadoRepository;

    public List<Encabezado> getList(){
        return encabezadoRepository.findAll();
    }

    public Optional<Encabezado> getEncabezadoId(long id){
        return encabezadoRepository.findById(id);
    }

    public void save(Encabezado encabezado){
        encabezadoRepository.save(encabezado);
    }

    public void delete(long id){
        encabezadoRepository.deleteById(id);
    }

    public Encabezado editarEncabezado(Encabezado encabezado){
        return encabezadoRepository.save(encabezado);
    }
}