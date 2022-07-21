package com.Portfolio.YoProgramoValdez.controller;

import com.Portfolio.YoProgramoValdez.entity.Banner;
import com.Portfolio.YoProgramoValdez.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banner")
@CrossOrigin(origins = "*")

public class BannerController {

    @Autowired
    BannerService bannerService;

    @GetMapping("/cargar")
    public ResponseEntity<List<Banner>> getBanner() {
        List<Banner> lista = bannerService.getList();
        return new ResponseEntity<List<Banner>>(lista, HttpStatus.OK);
    }

    @PutMapping("/editar")
    public ResponseEntity<Banner> editar(@RequestBody Banner banner) {
        Banner editarBanner = bannerService.editarBanner(banner);
        return new ResponseEntity<>(editarBanner, HttpStatus.OK);
    }
}