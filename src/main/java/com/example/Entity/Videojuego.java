package com.example.Entity;

import jakarta.persistence.*;

@Entity()
@Table(name = "videojuego")
public class Videojuego {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column(name="nombre")
    private String nombre;
@Column(name="compania")
    private String compania;
@Column(name="genero")
    private String genero;

    public Videojuego() {
    }
    public Videojuego( String nombre, String compania, String genero) {
        this.nombre = nombre;
        this.compania = compania;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
