package es.ies.puerto.controller;

import es.ies.puerto.modelo.entities.Paciente;
import es.ies.puerto.service.PacienteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class PacienteControllerTest {
    private PacienteService pacienteService;
    private PacienteController pacienteController;

    @BeforeEach
    void setUp() {
        pacienteService = mock(PacienteService.class);
        pacienteController = new PacienteController();
        pacienteController.setPacienteService(pacienteService);
    }

    @Test
    void testGetAllObjects() {
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente());
        pacientes.add(new Paciente());
        when(pacienteService.getAllObjects()).thenReturn(pacientes);

        List<Paciente> result = pacienteController.getAllObjects();

        assertEquals(pacientes.size(), result.size());
        assertEquals(pacientes.get(0).getDni_paciente(), result.get(0).getDni_paciente());
        assertEquals(pacientes.get(1).getDni_paciente(), result.get(1).getDni_paciente());
    }

    @Test
    void testSaveObject() {
        Paciente paciente = new Paciente();
        when(pacienteService.saveObject(any(Paciente.class))).thenReturn(paciente);

        ResponseEntity<Paciente> response = pacienteController.saveObject(paciente);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(paciente, response.getBody());
    }

    @Test
    void testUpdateObject() {
        String id = "2";
        Paciente paciente = new Paciente();
        when(pacienteService.updateObject(any(Paciente.class))).thenReturn(paciente);

        ResponseEntity<Paciente> response = pacienteController.updateObject(id, paciente);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(paciente, response.getBody());
    }

    @Test
    void testDeleteObject() {
        ResponseEntity<Void> response = pacienteController.deleteObject("1");

        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        verify(pacienteService, times(1)).deleteObject("1");
    }
}
