package es.ies.puerto.mapper;

import es.ies.puerto.dto.MedicoDto;
import es.ies.puerto.modelo.entities.Medico;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MedicoMapperTest {
    Medico medico;
    Medico medicoMapper;
    MedicoDto medicoDto;
    MedicoDto medicoDtoMapper;

    @BeforeEach
    public void beforeEach() {
        medicoDto = new MedicoDto();
        medicoDto.setNombre("Pepe");
        medicoDto.setEspecialidad("Pepi");
        medicoDto.setDni_paciente(1);


        medico = new Medico();
        medico.setNombre("Pepito");
        medico.setEspecialidad("Jugador del Lol");
        medico.setDni_paciente(1);

    }

    @Test
    public void armaToArmaDTOTest() {
        medicoDtoMapper = MedicoMapper.medicoToMedicoDTO(medico);
        Assertions.assertEquals(medico.getDni_paciente(), medicoDtoMapper.getDni_paciente(), "Resultado inesperado");
        Assertions.assertEquals(medico.getNombre(), medicoDtoMapper.getNombre(), "Resultado inesperado");
        Assertions.assertEquals(medico.getEspecialidad(), medicoDtoMapper.getEspecialidad(), "Resultado inesperado");
    }

    @Test
    public void armaDTOToArmaTest() {
        medicoMapper = MedicoMapper.medicoDTOToMedico(medicoDto);
        Assertions.assertEquals(medicoDto.getDni_paciente(), medicoMapper.getDni_paciente(), "Resultado inesperado");
        Assertions.assertEquals(medicoDto.getNombre(), medicoMapper.getNombre(), "Resultado inesperado");
        Assertions.assertEquals(medicoDto.getEspecialidad(), medicoMapper.getEspecialidad(), "Resultado inesperado");

    }
}
