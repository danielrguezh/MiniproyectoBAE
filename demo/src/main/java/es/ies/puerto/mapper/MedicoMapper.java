package es.ies.puerto.mapper;

import es.ies.puerto.modelo.entities.Medico;
import es.ies.puerto.negocio.dto.MedicoDto;

public class MedicoMapper {
    public static MedicoDto medicoToMedicoDTO(Medico medico){
        if (medico == null){
            return null;
        }
        MedicoDto medicoDto = new MedicoDto();
        medicoDto.setNombre(medico.getNombre());
        medicoDto.setEspecialidad(medico.getEspecialidad());
        medicoDto.setDni_medico(medico.getDni_medico());

        return medicoDto;
    }

    public static Medico medicoDTOToMedico(MedicoDto medicoDto){
        if (medicoDto == null){
            return null;
        }
        Medico medico = new Medico();
        medico.setNombre(medicoDto.getNombre());
        medico.setEspecialidad(medicoDto.getEspecialidad());
        medico.setDni_medico(medicoDto.getDni_medico());

        return medico;
    }
}
