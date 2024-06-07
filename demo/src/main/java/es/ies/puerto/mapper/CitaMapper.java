package es.ies.puerto.mapper;

import es.ies.puerto.dto.CitaDto;
import es.ies.puerto.modelo.entities.Cita;

public class CitaMapper {
    public static CitaDto citaToCitaDTO(Cita cita){
        if (cita == null){
            return null;
        }
        CitaDto citaDto = new CitaDto();
        citaDto.setId_cita(cita.getId_cita());
        citaDto.setFecha(cita.getFecha());
        citaDto.setDni_medico(cita.getDni_medico());
        citaDto.setValoracion(cita.getValoracion());
        citaDto.setDni_paciente(cita.getDni_paciente());

        return citaDto;
    }

    public static Cita citaDTOToCita(CitaDto citaDto){
        if (citaDto == null){
            return null;
        }
        Cita cita = new Cita();
        cita.setId_cita(citaDto.getId_cita());
        cita.setFecha(citaDto.getFecha());
        cita.setDni_medico(citaDto.getDni_medico());
        cita.setValoracion(citaDto.getValoracion());
        cita.setDni_paciente(citaDto.getDni_paciente());

        return cita;
    }

}
