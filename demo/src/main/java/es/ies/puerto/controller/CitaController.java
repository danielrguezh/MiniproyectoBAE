package es.ies.puerto.controller;

import es.ies.puerto.controller.interfaces.ICrudControllerMongo;
import es.ies.puerto.modelo.entities.Cita;
import es.ies.puerto.service.CitaService;
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
public class CitaController implements ICrudControllerMongo<Cita> {
    private CitaService citaService;

    public CitaController() {
    }

    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @Autowired
    public void setCitaService(CitaService citaService) {
        this.citaService = citaService;
    }

    @GetMapping("/")
    @ApiOperation(value = "getAllObjects")
    public List<Cita> getAllObjects() {
        return citaService.getAllObjects();
    }


    @PostMapping("/")
    @ApiOperation(value = "saveObject")
    public ResponseEntity<Cita> saveObject(@RequestBody Cita cita) {
        Cita savedCita = citaService.saveObject(cita);
        return new ResponseEntity<>(savedCita, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    @ApiOperation(value = "updateObject")
    public ResponseEntity<Cita> updateObject(@PathVariable String id, @RequestBody Cita cita) {
        cita.setId_cita(id);
        Cita updatedCita = citaService.updateObject(cita);
        return new ResponseEntity<>(updatedCita, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value = "deleteObject")
    public ResponseEntity<Void> deleteObject(@PathVariable String id) {
        citaService.deleteObject(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
