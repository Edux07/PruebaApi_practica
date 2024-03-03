package com.example.Repository;

import com.example.Entity.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepo extends JpaRepository<Videojuego, Long> {
    public Videojuego findByID(Long id);
    public boolean existsById(Long id);


}
