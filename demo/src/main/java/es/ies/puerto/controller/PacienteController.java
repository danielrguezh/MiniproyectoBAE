package es.ies.puerto.controller;

import es.ies.puerto.modelo.entities.Cita;
import es.ies.puerto.modelo.entities.Paciente;
import es.ies.puerto.service.CitaService;
import es.ies.puerto.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/citas")
public class PacienteController {
    private PacienteService pacienteService;

    @Autowired
    public void setPacienteService(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/")

    public List<Paciente> getAllObjects() {
        return pacienteService.getAllObjects();
    }


    @PostMapping("/")
    public ResponseEntity<Paciente> saveObject(@RequestBody Paciente paciente) {
        Paciente savedPaciente= pacienteService.saveObject(paciente);
        return new ResponseEntity<>(savedPaciente, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Paciente> updateObject(@PathVariable String id, @RequestBody Paciente paciente) {
        paciente.setDni_paciente(id);
        Paciente updatedPaciente = pacienteService.updateObject(paciente);
        return new ResponseEntity<>(paciente, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteObject(@PathVariable String id) {
        pacienteService.deleteObject(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
