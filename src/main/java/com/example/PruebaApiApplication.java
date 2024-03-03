package com.example;

import com.example.Entity.Videojuego;
import com.example.Repository.VideoRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PruebaApiApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(PruebaApiApplication.class, args);
		 var repo = ac.getBean(VideoRepo.class);
		 repo.save(new Videojuego("Mario", "Nintendo", "Plataformas"));


	}

}
