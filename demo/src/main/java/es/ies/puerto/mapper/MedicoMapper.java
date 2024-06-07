package es.ies.puerto.mapper;

import es.ies.puerto.dto.MedicoDto;
import es.ies.puerto.modelo.entities.Medico;

public class MedicoMapper {
    public static MedicoDto medicoToMedicoDTO(Medico medico){
        if (medico == null){
            return null;
        }
        MedicoDto medicoDto = new MedicoDto();
        medicoDto.setDni_paciente(medico.getDni_paciente());
        medicoDto.setEspecialidad(medico.getEspecialidad());
        medicoDto.setNombre(medico.getNombre());

        return medicoDto;
    }
    public static Medico medicoDTOToMedico(MedicoDto medicoDto){
        if (medicoDto == null){
            return null;
        }
        Medico medico = new Medico();
        medico.setDni_paciente(medicoDto.getDni_paciente());
        medico.setEspecialidad(medicoDto.getEspecialidad());
        medico.setNombre(medicoDto.getNombre());

        return medico;
    }

}
