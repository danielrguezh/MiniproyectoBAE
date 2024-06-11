package es.ies.puerto.service;

import es.ies.puerto.modelo.entities.Paciente;
import es.ies.puerto.repositories.IPacienteRepository;
import es.ies.puerto.service.interfaces.ICrudServiceMongoDb;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PacienteService implements ICrudServiceMongoDb<Paciente> {
    private IPacienteRepository pacienteRepository;

    @Autowired
    public void setPacienteRepository(IPacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public List<Paciente> getAllObjects() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente saveObject(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public Paciente updateObject(Paciente paciente) {
        if (pacienteRepository.existsById(paciente.getDni_paciente())) {
            return pacienteRepository.save(paciente);
        } else {
            throw new RuntimeException("Paciente not found with id " + paciente.getDni_paciente());
        }
    }

    @Override
    public void deleteObject(String id) {
        if (pacienteRepository.existsById(id)) {
            pacienteRepository.deleteById(id);
        } else {
            throw new RuntimeException("Paciente not found with id " + id);
        }
    }
}
