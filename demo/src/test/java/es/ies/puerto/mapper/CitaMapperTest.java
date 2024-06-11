package es.ies.puerto.mapper;

import es.ies.puerto.negocio.dto.CitaDto;
import es.ies.puerto.modelo.entities.Cita;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CitaMapperTest {
    Cita cita;
    Cita citaMapper;
    CitaDto citaDto;
    CitaDto citaDtoMapper;

    @BeforeEach
    public void beforeEach() {
        citaDto = new CitaDto();
        citaDto.setId_cita("1");
        citaDto.setDni_medico("Pepo");
        citaDto.setDni_paciente("Pepi");
        citaDto.setValoracion("Pepa");
        citaDto.setFecha("Pepe");


        cita = new Cita();;
        cita.setId_cita("1");
        cita.setDni_medico("NOMBRE_TEST");
        cita.setDni_paciente("NOMBRE_TEST");
        cita.setValoracion("NOMBRE_TEST");
        cita.setFecha("NOMBRE_TEST");

    }

    @Test
    public void armaToArmaDTOTest() {
        citaDtoMapper = CitaMapper.citaToCitaDTO(cita);
        Assertions.assertEquals(cita.getId_cita(), citaDtoMapper.getId_cita(), "Resultado inesperado");
        Assertions.assertEquals(cita.getDni_medico(), citaDtoMapper.getDni_medico(), "Resultado inesperado");
        Assertions.assertEquals(cita.getDni_paciente(), citaDtoMapper.getDni_paciente(), "Resultado inesperado");
        Assertions.assertEquals(cita.getValoracion(), citaDtoMapper.getValoracion(), "Resultado inesperado");
        Assertions.assertEquals(cita.getFecha(), citaDtoMapper.getFecha(), "Resultado inesperado");

    }

    @Test
    public void armaDTOToArmaTest() {
        citaMapper = CitaMapper.citaDTOToCita(citaDto);
        Assertions.assertEquals(citaDto.getId_cita(), citaMapper.getId_cita(), "Resultado inesperado");
        Assertions.assertEquals(citaDto.getDni_medico(), citaMapper.getDni_medico(), "Resultado inesperado");
        Assertions.assertEquals(citaDto.getDni_paciente(), citaMapper.getDni_paciente(), "Resultado inesperado");
        Assertions.assertEquals(citaDto.getValoracion(), citaMapper.getValoracion(), "Resultado inesperado");
        Assertions.assertEquals(citaDto.getFecha(), citaMapper.getFecha(), "Resultado inesperado");
    }
}
