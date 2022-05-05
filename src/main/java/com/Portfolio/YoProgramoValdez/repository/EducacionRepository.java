package com.Portfolio.YoProgramoValdez.repository;

import com.Portfolio.YoProgramoValdez.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    Optional<Educacion> findById(Long id);
    boolean existsById(Long id);
}