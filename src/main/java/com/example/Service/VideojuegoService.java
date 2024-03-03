package com.example.Service;

import com.example.Entity.Videojuego;
import com.example.Repository.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideojuegoService implements VideoService{

    private VideoRepo videoRepo;

    public VideojuegoService(VideoRepo videoRepo) {
        this.videoRepo = videoRepo;
    }

    @Override
    public List<Videojuego> findAll() {
        return null;
    }

    @Override
    public Videojuego findById(Long id) {
        return null;
    }

    @Override
    public Optional<Videojuego> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Videojuego save(Videojuego videojuego) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteAll() {

    }
}
