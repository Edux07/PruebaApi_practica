package com.example.Service;
import com.example.Entity.Videojuego;
import java.util.List;
import java.util.Optional;

public interface VideoService {

    List<Videojuego> findAll();
    Videojuego findById(Long id);
    Optional<Videojuego> findByName(String name);

    Videojuego save(Videojuego videojuego);
    void deleteById(Long id);
    void deleteAll();


}
