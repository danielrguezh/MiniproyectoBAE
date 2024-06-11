package es.ies.puerto.service;

import es.ies.puerto.modelo.entities.Medico;
import es.ies.puerto.repositories.IMedicoRepository;
import es.ies.puerto.service.interfaces.ICrudServiceMongoDb;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MedicoService implements ICrudServiceMongoDb<Medico> {
    private IMedicoRepository medicoRepository;

    @Autowired
    public void setMedicoRepository(IMedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    @Override
    public List<Medico> getAllObjects() {
        return medicoRepository.findAll();
    }

    @Override
    public Medico saveObject(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public Medico updateObject(Medico medico) {
        if (medicoRepository.existsById(medico.getDni_paciente())) {
            return medicoRepository.save(medico);
        } else {
            throw new RuntimeException("Medico not found with id " + medico.getDni_paciente());
        }
    }

    @Override
    public void deleteObject(String id) {
        if (medicoRepository.existsById(id)) {
            medicoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Medico not found with id " + id);
        }
    }
}
