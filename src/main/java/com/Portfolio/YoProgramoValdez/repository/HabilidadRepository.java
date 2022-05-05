package com.Portfolio.YoProgramoValdez.repository;

import com.Portfolio.YoProgramoValdez.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad,Long> {
    Optional<Habilidad> findById(Long id);
    boolean existsById(Long id);

}