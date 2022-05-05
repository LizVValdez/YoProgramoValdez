package com.Portfolio.YoProgramoValdez.repository;

import com.Portfolio.YoProgramoValdez.entity.Encabezado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EncabezadoRepository extends JpaRepository<Encabezado,Long> {

    Optional<Encabezado> findById(Long id);
    boolean existsById(Long id);

}
