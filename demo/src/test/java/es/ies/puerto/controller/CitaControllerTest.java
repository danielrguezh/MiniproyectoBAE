package es.ies.puerto.controller;

import es.ies.puerto.modelo.entities.Cita;
import es.ies.puerto.service.CitaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class CitaControllerTest {
    private CitaService citaService;
    private CitaController citaController;

    @BeforeEach
    void setUp() {
        citaService = mock(CitaService.class);
        citaController = new CitaController();
        citaController.setCitaService(citaService);
    }

    @Test
    void testGetAllObjects() {
        List<Cita> citas = new ArrayList<>();
        citas.add(new Cita("SW-002","2/2/2022", "12345678J", "12345678H","tabien"));
        citas.add(new Cita("SW-003","3/3/2023", "12345678J", "12345678H","tamal"));
        when(citaService.getAllObjects()).thenReturn(citas);

        List<Cita> result = citaController.getAllObjects();

        assertEquals(citas.size(), result.size());
        assertEquals(citas.get(0).getId_cita(), result.get(0).getId_cita());
        assertEquals(citas.get(1).getId_cita(), result.get(1).getId_cita());
    }

    @Test
    void testSaveObject() {
        Cita cita = new Cita("1", "1/1/2017", "1977J", "2222J","ta regunlinchi");
        when(citaService.saveObject(any(Cita.class))).thenReturn(cita);

        ResponseEntity<Cita> response = citaController.saveObject(cita);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(cita, response.getBody());
    }

    @Test
    void testUpdateObject() {
        String id = "2";
        Cita cita = new Cita("1", "1/1/2017", "1977J", "2222J","ta regunlinchi");
        when(citaService.updateObject(any(Cita.class))).thenReturn(cita);

        ResponseEntity<Cita> response = citaController.updateObject(id, cita);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(cita, response.getBody());
    }

    @Test
    void testDeleteObject() {
        ResponseEntity<Void> response = citaController.deleteObject("1");

        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        verify(citaService, times(1)).deleteObject("1");
    }
}
