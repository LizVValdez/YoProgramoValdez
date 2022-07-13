package com.Portfolio.YoProgramoValdez.repository;

import com.Portfolio.YoProgramoValdez.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EncabezadoRepository extends JpaRepository<Banner,Long> {

    Optional<Banner> findById(Long id);
    boolean existsById(Long id);

}
