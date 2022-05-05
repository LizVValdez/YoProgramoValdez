package com.Portfolio.YoProgramoValdez.repository;

import com.Portfolio.YoProgramoValdez.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Long> {
    Optional<Experiencia> findById(Long id);
    boolean existsById(Long id);

}