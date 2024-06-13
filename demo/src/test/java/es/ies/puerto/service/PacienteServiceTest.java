package es.ies.puerto.service;


import es.ies.puerto.modelo.entities.Paciente;
import es.ies.puerto.repositories.IPacienteRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PacienteServiceTest {
    @Mock
    private IPacienteRepository  pacienteRepository;
    @InjectMocks
    private PacienteService pacienteService;
    private Paciente paciente1;
    private Paciente paciente2;

    @BeforeEach
    void setUp() {
        pacienteRepository = mock(IPacienteRepository.class);
        pacienteService = new PacienteService();
        pacienteService.setPacienteRepository(pacienteRepository);

        paciente1 = new Paciente("1","Pepito", "Mucha friebre" );
        paciente2 = new Paciente("2","Pepata", "Pobrema en el corazon");

    }

    @Test
    void testGetAllObjects() {
        List<Paciente> pacientes = Arrays.asList(paciente1, paciente2);
        when(pacienteRepository.findAll()).thenReturn(pacientes);

        List<Paciente> result = pacienteService.getAllObjects();

        assertEquals(2, result.size());
        assertEquals(paciente1.getDni_paciente(), result.get(0).getDni_paciente());
        assertEquals(paciente2.getDni_paciente(), result.get(1).getDni_paciente());

        verify(pacienteRepository, times(1)).findAll();
    }

    @Test
    void testSaveObject() {
        when(pacienteRepository.save(paciente1)).thenReturn(paciente1);

        Paciente result = pacienteService.saveObject(paciente1);

        assertNotNull(result);
        assertEquals(paciente1.getDni_paciente(), result.getDni_paciente());

        verify(pacienteRepository, times(1)).save(paciente1);
    }

    @Test
    void testUpdateObjectExists() {
        when(pacienteRepository.existsById(paciente1.getDni_paciente())).thenReturn(true);
        when(pacienteRepository.save(paciente1)).thenReturn(paciente1);

        Paciente result = pacienteService.updateObject(paciente1);

        assertNotNull(result);
        assertEquals(paciente1.getDni_paciente(), result.getDni_paciente());

        verify(pacienteRepository, times(1)).existsById(paciente1.getDni_paciente());
        verify(pacienteRepository, times(1)).save(paciente1);
    }

    @Test
    void testUpdateObjectNotExists() {
        when(pacienteRepository.existsById(paciente1.getDni_paciente())).thenReturn(false);

        assertThrows(RuntimeException.class, () -> pacienteService.updateObject(paciente1));

        verify(pacienteRepository, times(1)).existsById(paciente1.getDni_paciente());
        verify(pacienteRepository, times(0)).save(paciente1);
    }

    @Test
    void testDeleteObjectExists() {
        when(pacienteRepository.existsById(paciente1.getDni_paciente())).thenReturn(true);

        pacienteService.deleteObject(paciente1.getDni_paciente());

        verify(pacienteRepository, times(1)).existsById(paciente1.getDni_paciente());
        verify(pacienteRepository, times(1)).deleteById(paciente1.getDni_paciente());
    }

    @Test
    void testDeleteObjectNotExists() {
        when(pacienteRepository.existsById(paciente1.getDni_paciente())).thenReturn(false);

        assertThrows(RuntimeException.class, () -> pacienteService.deleteObject(paciente1.getDni_paciente()));

        verify(pacienteRepository, times(1)).existsById(paciente1.getDni_paciente());
        verify(pacienteRepository, times(0)).deleteById(paciente1.getDni_paciente());
    }
}
