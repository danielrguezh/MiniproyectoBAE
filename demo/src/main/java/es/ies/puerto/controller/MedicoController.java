package es.ies.puerto.controller;

import es.ies.puerto.modelo.entities.Cita;
import es.ies.puerto.modelo.entities.Medico;
import es.ies.puerto.service.CitaService;
import es.ies.puerto.service.MedicoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
@Api(value = "Ejemplo de API", tags = {"Ejemplo"})
public class MedicoController {
    private MedicoService medicoService;

    @Autowired
    public void setMedicoService(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping("/")
    @ApiOperation(value = "getAllObjects")
    public List<Medico> getAllObjects() {
        return medicoService.getAllObjects();
    }


    @PostMapping("/")
    @ApiOperation(value = "saveObject")
    public ResponseEntity<Medico> saveObject(@RequestBody Medico medico) {
        Medico savedMedico = medicoService.saveObject(medico);
        return new ResponseEntity<>(savedMedico, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    @ApiOperation(value = "updateObject")
    public ResponseEntity<Medico> updateObject(@PathVariable String id, @RequestBody Medico medico) {
        medico.setDni_paciente(id);
        Medico updatedMedico = medicoService.updateObject(medico);
        return new ResponseEntity<>(updatedMedico, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value = "deleteObject")
    public ResponseEntity<Void> deleteObject(@PathVariable String id) {
        medicoService.deleteObject(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
