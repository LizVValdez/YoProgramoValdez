package com.Portfolio.YoProgramoValdez.repository;

import com.Portfolio.YoProgramoValdez.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Long> {
    Optional<Proyecto> findById(Long id);
    boolean existsById(Long id);

}