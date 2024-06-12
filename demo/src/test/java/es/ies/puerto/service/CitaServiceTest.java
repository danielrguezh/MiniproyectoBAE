package es.ies.puerto.service;

import es.ies.puerto.modelo.entities.Cita;
import es.ies.puerto.repositories.ICitaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class CitaServiceTest {
    @Mock
    private ICitaRepository citaRepository;
    @InjectMocks
    private CitaService citaService;
    private Cita cita1;
    private Cita cita2;

    @BeforeEach
    void setUp() {
        citaRepository = mock(ICitaRepository.class);
        citaService = new CitaService();
        citaService.setCitaRepository(citaRepository);

        cita1 = new Cita("SW-002","2/2/2022", "12345678J", "12345678H","tabien");
        cita2 = new Cita("SW-003","3/3/2023", "12345678J", "12345678H","tamal");

    }

    @Test
    void testGetAllObjects() {
        List<Cita> citas = Arrays.asList(cita1, cita2);
        when(citaRepository.findAll()).thenReturn(citas);

        List<Cita> result = citaService.getAllObjects();

        assertEquals(2, result.size());
        assertEquals(cita1.getId_cita(), result.get(0).getId_cita());
        assertEquals(cita2.getId_cita(), result.get(1).getId_cita());

        verify(citaRepository, times(1)).findAll();
    }

    @Test
    void testSaveObject() {
        when(citaRepository.save(cita1)).thenReturn(cita1);

        Cita result = citaService.saveObject(cita1);

        assertNotNull(result);
        assertEquals(cita1.getId_cita(), result.getId_cita());

        verify(citaRepository, times(1)).save(cita1);
    }

    @Test
    void testUpdateObjectExists() {
        when(citaRepository.existsById(cita1.getId_cita())).thenReturn(true);
        when(citaRepository.save(cita1)).thenReturn(cita1);

        Cita result = citaService.updateObject(cita1);

        assertNotNull(result);
        assertEquals(cita1.getId_cita(), result.getId_cita());

        verify(citaRepository, times(1)).existsById(cita1.getId_cita());
        verify(citaRepository, times(1)).save(cita1);
    }

    @Test
    void testUpdateObjectNotExists() {
        when(citaRepository.existsById(cita1.getId_cita())).thenReturn(false);

        assertThrows(RuntimeException.class, () -> citaService.updateObject(cita1));

        verify(citaRepository, times(1)).existsById(cita1.getId_cita());
        verify(citaRepository, times(0)).save(cita1);
    }

    @Test
    void testDeleteObjectExists() {
        when(citaRepository.existsById(cita1.getId_cita())).thenReturn(true);

        citaService.deleteObject(cita1.getId_cita());

        verify(citaRepository, times(1)).existsById(cita1.getId_cita());
        verify(citaRepository, times(1)).deleteById(cita1.getId_cita());
    }

    @Test
    void testDeleteObjectNotExists() {
        when(citaRepository.existsById(cita1.getId_cita())).thenReturn(false);

        assertThrows(RuntimeException.class, () -> citaService.deleteObject(cita1.getId_cita()));

        verify(citaRepository, times(1)).existsById(cita1.getId_cita());
        verify(citaRepository, times(0)).deleteById(cita1.getId_cita());
    }
}
