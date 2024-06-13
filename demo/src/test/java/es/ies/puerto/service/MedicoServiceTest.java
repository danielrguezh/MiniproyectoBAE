package es.ies.puerto.service;

import es.ies.puerto.modelo.entities.Medico;
import es.ies.puerto.repositories.IMedicoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MedicoServiceTest {
    @Mock
    private IMedicoRepository medicoRepository;
    @InjectMocks
    private MedicoService medicoService;
    private Medico medico1;
    private Medico medico2;

    @BeforeEach
    void setUp() {
        medicoRepository = mock(IMedicoRepository.class);
        medicoService = new MedicoService();
        medicoService.setMedicoRepository(medicoRepository);

        medico1 = new Medico("1","Pepe", "Alergologo" );
        medico2 = new Medico("2","Pepa", "Cardiologa");

    }

    @Test
    void testGetAllObjects() {
        List<Medico> medicos = Arrays.asList(medico1, medico2);
        when(medicoRepository.findAll()).thenReturn(medicos);

        List<Medico> result = medicoService.getAllObjects();

        assertEquals(2, result.size());
        assertEquals(medico1.getDni_medico(), result.get(0).getDni_medico());
        assertEquals(medico2.getDni_medico(), result.get(1).getDni_medico());

        verify(medicoRepository, times(1)).findAll();
    }

    @Test
    void testSaveObject() {
        when(medicoRepository.save(medico1)).thenReturn(medico1);

        Medico result = medicoService.saveObject(medico1);

        assertNotNull(result);
        assertEquals(medico1.getDni_medico(), result.getDni_medico());

        verify(medicoRepository, times(1)).save(medico1);
    }

    @Test
    void testUpdateObjectExists() {
        when(medicoRepository.existsById(medico1.getDni_medico())).thenReturn(true);
        when(medicoRepository.save(medico1)).thenReturn(medico1);

        Medico result = medicoService.updateObject(medico1);

        assertNotNull(result);
        assertEquals(medico1.getDni_medico(), result.getDni_medico());

        verify(medicoRepository, times(1)).existsById(medico1.getDni_medico());
        verify(medicoRepository, times(1)).save(medico1);
    }

    @Test
    void testUpdateObjectNotExists() {
        when(medicoRepository.existsById(medico1.getDni_medico())).thenReturn(false);

        assertThrows(RuntimeException.class, () -> medicoService.updateObject(medico1));

        verify(medicoRepository, times(1)).existsById(medico1.getDni_medico());
        verify(medicoRepository, times(0)).save(medico1);
    }

    @Test
    void testDeleteObjectExists() {
        when(medicoRepository.existsById(medico1.getDni_medico())).thenReturn(true);

        medicoService.deleteObject(medico1.getDni_medico());

        verify(medicoRepository, times(1)).existsById(medico1.getDni_medico());
        verify(medicoRepository, times(1)).deleteById(medico1.getDni_medico());
    }

    @Test
    void testDeleteObjectNotExists() {
        when(medicoRepository.existsById(medico1.getDni_medico())).thenReturn(false);

        assertThrows(RuntimeException.class, () -> medicoService.deleteObject(medico1.getDni_medico()));

        verify(medicoRepository, times(1)).existsById(medico1.getDni_medico());
        verify(medicoRepository, times(0)).deleteById(medico1.getDni_medico());
    }
}
