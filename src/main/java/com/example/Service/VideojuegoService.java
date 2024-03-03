package com.example.Service;

import com.example.Entity.Videojuego;
import com.example.Repository.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {
    @Autowired
    private VideoRepo videoRepo;

    public Videojuego addVideojuego(Videojuego videojuego) {
        return videoRepo.save(videojuego);
    }
    public Videojuego getVideojuego(Long id) {
        return videoRepo.findByID(id);
    }
    public void deleteVideojuego(Long id) {
        videoRepo.deleteById(id);
    }
    public Videojuego updateVideojuego(Long id, Videojuego videojuego) {
        videojuego.setId(id);
        return videoRepo.save(videojuego);
    }



}
