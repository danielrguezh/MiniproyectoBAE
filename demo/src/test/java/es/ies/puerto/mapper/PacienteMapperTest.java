package es.ies.puerto.mapper;

import es.ies.puerto.negocio.dto.PacienteDto;
import es.ies.puerto.modelo.entities.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PacienteMapperTest {
    Paciente paciente;
    Paciente pacienteMapper;
    PacienteDto pacienteDto;
    PacienteDto pacienteDtoMapper;

    @BeforeEach
    public void beforeEach() {
        pacienteDto = new PacienteDto();
        pacienteDto.setDni_paciente("1");
        pacienteDto.setNombre("kfhs");
        pacienteDto.setHistorial("jsnd");



        paciente = new Paciente();
        paciente.setDni_paciente("1");
        paciente.setHistorial("1");
        paciente.setNombre("1");
    }

    @Test
    public void armaToArmaDTOTest() {
        pacienteDtoMapper = PacienteMapper.pacienteToPacienteDTO(paciente);
        Assertions.assertEquals(paciente.getDni_paciente(), pacienteDtoMapper.getDni_paciente(), "Resultado inesperado");
        Assertions.assertEquals(paciente.getHistorial(), pacienteDtoMapper.getHistorial(), "Resultado inesperado");
        Assertions.assertEquals(paciente.getNombre(), pacienteDtoMapper.getNombre(), "Resultado inesperado");

    }

    @Test
    public void armaDTOToArmaTest() {
        pacienteMapper = PacienteMapper.pacienteDTOToPaciente(pacienteDto);
        Assertions.assertEquals(pacienteDto.getDni_paciente(), pacienteMapper.getDni_paciente(), "Resultado inesperado");
        Assertions.assertEquals(pacienteDto.getHistorial(), pacienteMapper.getHistorial(), "Resultado inesperado");
        Assertions.assertEquals(pacienteDto.getNombre(), pacienteMapper.getNombre(), "Resultado inesperado");

    }
}
