package com.Portfolio.YoProgramoValdez.controller;

import com.Portfolio.YoProgramoValdez.entity.Banner;
import com.Portfolio.YoProgramoValdez.service.EncabezadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encabezado")
@CrossOrigin(origins = "http://localhost:4200")

public class EncabezadoController {

    @Autowired
    EncabezadoService encabezadoService;

    @GetMapping("/banner")
    public ResponseEntity<List<Banner>> getImagenesEncabezado() {
        List<Banner> lista = encabezadoService.getList();
        return new ResponseEntity<List<Banner>>(lista, HttpStatus.OK);
    }

    @PutMapping("/editar")
    public ResponseEntity<Banner> editar(@RequestBody Banner banner) {
        Banner editarBanner = encabezadoService.editarEncabezado(banner);
        return new ResponseEntity<>(editarBanner, HttpStatus.OK);
    }
}