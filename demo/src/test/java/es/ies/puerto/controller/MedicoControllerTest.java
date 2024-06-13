package es.ies.puerto.controller;

import es.ies.puerto.modelo.entities.Medico;
import es.ies.puerto.service.MedicoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class MedicoControllerTest {
    private MedicoService medicoService;
    private MedicoController medicoController;

    @BeforeEach
    void setUp() {
        medicoService = mock(MedicoService.class);
        medicoController = new MedicoController();
        medicoController.setMedicoService(medicoService);
    }

    @Test
    void testGetAllObjects() {
        List<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico("1","Pepe", "Alergologo"));
        medicos.add(new Medico("2","Pepa", "Cardiologa"));
        when(medicoService.getAllObjects()).thenReturn(medicos);

        List<Medico> result = medicoController.getAllObjects();

        assertEquals(medicos.size(), result.size());
        assertEquals(medicos.get(0).getDni_medico(), result.get(0).getDni_medico());
        assertEquals(medicos.get(1).getDni_medico(), result.get(1).getDni_medico());
    }

    @Test
    void testSaveObject() {
        Medico medico = new Medico("1", "Pepa","ta regunlinchi");
        when(medicoService.saveObject(any(Medico.class))).thenReturn(medico);

        ResponseEntity<Medico> response = medicoController.saveObject(medico);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(medico, response.getBody());
    }

    @Test
    void testUpdateObject() {
        String id = "2";
        Medico medico = new Medico("2", "Pepep","Buenas noches");
        when(medicoService.updateObject(any(Medico.class))).thenReturn(medico);

        ResponseEntity<Medico> response = medicoController.updateObject(id, medico);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(medico, response.getBody());
    }

    @Test
    void testDeleteObject() {
        ResponseEntity<Void> response = medicoController.deleteObject("1");

        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        verify(medicoService, times(1)).deleteObject("1");
    }

}
