package com.examen.esteban.Controller;

import com.examen.esteban.Models.Asignatura;
import com.examen.esteban.Service.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class EntidadController {


    @Autowired
    EntidadService entidadService;

    @GetMapping("/listar")
    public ResponseEntity<List<Asignatura>> ListarTodos() {
        return new ResponseEntity<>(entidadService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Asignatura> Crear(
            @RequestBody Asignatura p) {
        return new ResponseEntity<>(entidadService.save(p),
                HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Asignatura> eliminar(@PathVariable Long id) {
        entidadService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Asignatura> Actualizar(@PathVariable Long id, @RequestBody Asignatura p) {
        Asignatura personaENcontrada = entidadService.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaENcontrada.setNombre(p.getNombre());
                personaENcontrada.setN_horas(p.getN_horas());
                personaENcontrada.setN_horas_autonomas(p.getN_horas_autonomas());
                personaENcontrada.setN_horas_practicas(p.getN_horas_practicas());
                return new ResponseEntity<>(entidadService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

}
