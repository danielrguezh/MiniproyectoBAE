package es.ies.puerto.mapper;

import es.ies.puerto.dto.CitaDto;
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
        citaDto.setId_cita(1);
        citaDto.setDni_paciente("Pepe");
        citaDto.setFecha("2637484L");
        citaDto.setValoracion("Cinco estrellas");
        citaDto.setDni_medico("Manolo");


        cita = new Cita();;
        cita.setId_cita(1);
        cita.setDni_paciente("Hola");
        cita.setDni_medico("Buenas");
        cita.setFecha("holis");
        cita.setValoracion("Daniel no es un buen empreado");

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
