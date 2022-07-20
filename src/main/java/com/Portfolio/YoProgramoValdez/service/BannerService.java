package com.Portfolio.YoProgramoValdez.service;

import com.Portfolio.YoProgramoValdez.entity.Banner;
import com.Portfolio.YoProgramoValdez.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BannerService {

    @Autowired
    BannerRepository bannerRepository;

    public List<Banner> getList(){
        return bannerRepository.findAll();
    }

    public Optional<Banner> getBannerId(long id){
        return bannerRepository.findById(id);
    }

    public void save(Banner banner){
        bannerRepository.save(banner);
    }

    public void delete(long id){
        bannerRepository.deleteById(id);
    }

    public Banner editarBanner(Banner banner){
        return bannerRepository.save(banner);
    }
}