package es.ies.puerto.mapper;

import es.ies.puerto.negocio.dto.PacienteDto;
import es.ies.puerto.modelo.entities.Paciente;

public class PacienteMapper {
    public static PacienteDto pacienteToPacienteDTO(Paciente paciente){
        if (paciente == null){
            return null;
        }
        PacienteDto pacienteDto = new PacienteDto();
        pacienteDto.setNombre(paciente.getNombre());
        pacienteDto.setDni_paciente(paciente.getDni_paciente());
        pacienteDto.setHistorial(paciente.getHistorial());


        return pacienteDto;
    }

    public static Paciente pacienteDTOToPaciente(PacienteDto pacienteDto){
        if (pacienteDto == null){
            return null;
        }
        Paciente paciente = new Paciente();
        paciente.setNombre(pacienteDto.getNombre());
        paciente.setDni_paciente(pacienteDto.getDni_paciente());
        paciente.setHistorial(pacienteDto.getHistorial());

        return paciente;
    }
}
