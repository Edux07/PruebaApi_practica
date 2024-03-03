package com.example.Controller;
import com.example.Entity.Videojuego;
import com.example.Repository.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controlador {

    @Autowired
    private VideoRepo VideoRepo;

    @GetMapping("/videojuego/{id}")
    public ResponseEntity<Videojuego> BuscarVideojuegoID(@PathVariable long id){
        Videojuego videojuego = VideoRepo.findByID(id);
        return ResponseEntity.ok(videojuego);

    }
    @PostMapping("/videojuego")
    public ResponseEntity<String> CrearVideojuego(@RequestBody Videojuego videojuego){
        if(videojuego != null && videojuego.getNombre()!= null && videojuego.getCompania()!= null && videojuego.getGenero()!= null){
            VideoRepo.save(videojuego);
            return ResponseEntity.ok("El videojuego se ha creado");
        }else if (videojuego.getNombre()== null){
            return ResponseEntity.badRequest().body("El nombre del videojuego es obligatorio");
        } else if (videojuego.getCompania()== null) {
            return ResponseEntity.badRequest().body("La compañía del videojuego es obligatoria");
        } else if (videojuego.getGenero()== null) {
            return ResponseEntity.badRequest().body("El género del videojuego es obligatorio");
        } else {
            return ResponseEntity.badRequest().body("Error al crear el videojuego");
        }
    }
    @PutMapping("/videojuego/{id}")
    public ResponseEntity<String>EditarVideojuego(@PathVariable long id, @RequestBody Videojuego videojuego){
        if(videojuego.getId() == id && VideoRepo.existsById(id)){
            VideoRepo.save(videojuego);
            return ResponseEntity.ok("El videojuego se ha modificado");
        }else {
            return ResponseEntity.badRequest().body("Error al modificar el videojuego");
        }
    }
    @DeleteMapping("/videojuego/{id}")
        public ResponseEntity<String>EliminarVidejuego(@PathVariable long id) {
        if (VideoRepo.existsById(id)) {
            VideoRepo.deleteById(id);
            return ResponseEntity.ok("El videojuego se ha eliminado");
        }
        return ResponseEntity.badRequest().body("Error al eliminar el videojuego");

    }
}
