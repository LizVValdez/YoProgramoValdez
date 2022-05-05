package com.Portfolio.YoProgramoValdez.service;

import com.Portfolio.YoProgramoValdez.entity.Rol;
import com.Portfolio.YoProgramoValdez.enums.RolNombre;
import com.Portfolio.YoProgramoValdez.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
}