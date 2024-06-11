package es.ies.puerto.mapper;


import es.ies.puerto.negocio.dto.MedicoDto;
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
        medicoDto.setDni_paciente("1");
        medicoDto.setEspecialidad("Lolo");
        medicoDto.setNombre("Hola");


        medico = new Medico();
        medico.setDni_paciente("1");
        medico.setEspecialidad("kdnvs");
        medico.setNombre("hshk");


    }

    @Test
    public void armaToArmaDTOTest() {
        medicoDtoMapper = MedicoMapper.medicoToMedicoDTO(medico);
        Assertions.assertEquals(medico.getDni_paciente(), medicoDtoMapper.getDni_paciente(), "Resultado inesperado");
        Assertions.assertEquals(medico.getEspecialidad(), medicoDtoMapper.getEspecialidad(), "Resultado inesperado");
        Assertions.assertEquals(medico.getNombre(), medicoDtoMapper.getNombre(), "Resultado inesperado");

    }

    @Test
    public void armaDTOToArmaTest() {
        medicoMapper = MedicoMapper.medicoDTOToMedico(medicoDto);
        Assertions.assertEquals(medicoDto.getDni_paciente(), medicoMapper.getDni_paciente(), "Resultado inesperado");
        Assertions.assertEquals(medicoDto.getEspecialidad(), medicoMapper.getEspecialidad(), "Resultado inesperado");
        Assertions.assertEquals(medicoDto.getNombre(), medicoMapper.getNombre(), "Resultado inesperado");

    }
}


