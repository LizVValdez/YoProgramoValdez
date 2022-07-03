package com.Portfolio.YoProgramoValdez;

import com.Portfolio.YoProgramoValdez.repository.FileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.Arrays;

@SpringBootApplication
public class YoProgramoValdezApplication implements CommandLineRunner {

	@Resource
	FileRepository fileService;
	public static void main(String[] args) {
		SpringApplication.run(YoProgramoValdezApplication.class, args);
	}
	@Override
	public void run(String... arg) throws Exception{
		fileService.deleteAll();
		fileService.init();
	}
}