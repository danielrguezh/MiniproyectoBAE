package es.ies.puerto.controller;


import es.ies.puerto.modelo.entities.Medico;
import es.ies.puerto.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class MedicoController {
    private MedicoService medicoService;

    @Autowired
    public void setMedicoService(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping("/")

    public List<Medico> getAllObjects() {
        return medicoService.getAllObjects();
    }


    @PostMapping("/")
    public ResponseEntity<Medico> saveObject(@RequestBody Medico medico) {
        Medico savedMedico = medicoService.saveObject(medico);
        return new ResponseEntity<>(savedMedico, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Medico> updateObject(@PathVariable String id, @RequestBody Medico medico) {
        medico.setDni_medico(id);
        Medico updatedMedico = medicoService.updateObject(medico);
        return new ResponseEntity<>(updatedMedico, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteObject(@PathVariable String id) {
        medicoService.deleteObject(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
