package es.ies.puerto.controller;

import es.ies.puerto.modelo.entities.Cita;
import es.ies.puerto.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {
    private CitaService citaService;

    @Autowired
    public void setCitaService(CitaService citaService) {
        this.citaService = citaService;
    }

    @GetMapping("/")

    public List<Cita> getAllObjects() {
        return citaService.getAllObjects();
    }


    @PostMapping("/")
    public ResponseEntity<Cita> saveObject(@RequestBody Cita cita) {
        Cita savedCita = citaService.saveObject(cita);
        return new ResponseEntity<>(savedCita, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cita> updateObject(@PathVariable String id, @RequestBody Cita cita) {
        cita.setId_cita(id);
        Cita updatedCita = citaService.updateObject(cita);
        return new ResponseEntity<>(updatedCita, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteObject(@PathVariable String id) {
        citaService.deleteObject(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
