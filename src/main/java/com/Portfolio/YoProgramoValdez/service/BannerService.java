package com.Portfolio.YoProgramoValdez.service;

import com.Portfolio.YoProgramoValdez.entity.Banner;
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

    public List<Banner> getList(){
        return encabezadoRepository.findAll();
    }

    public Optional<Banner> getEncabezadoId(long id){
        return encabezadoRepository.findById(id);
    }

    public void save(Banner banner){
        encabezadoRepository.save(banner);
    }

    public void delete(long id){
        encabezadoRepository.deleteById(id);
    }

    public Banner editarEncabezado(Banner banner){
        return encabezadoRepository.save(banner);
    }
}