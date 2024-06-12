package es.ies.puerto.service;

import es.ies.puerto.modelo.entities.Cita;
import es.ies.puerto.repositories.ICitaRepository;
import es.ies.puerto.service.interfaces.ICrudServiceMongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService implements ICrudServiceMongoDb<Cita> {
    private ICitaRepository citaRepository;
    @Autowired
    public void setCitaRepository(ICitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @Override
    public List<Cita> getAllObjects() {
        return citaRepository.findAll();
    }

    @Override
    public Cita saveObject(Cita cita) {
        return citaRepository.save(cita);
    }


    @Override
    public Cita updateObject(Cita cita) {
        if (citaRepository.existsById(cita.getId_cita())) {
            return citaRepository.save(cita);
        } else {
            throw new RuntimeException("Cita not found with id " + cita.getId_cita());
        }
    }

    @Override
    public void deleteObject(String id) {
        if (citaRepository.existsById(id)) {
            citaRepository.deleteById(id);
        } else {
            throw new RuntimeException("Character not found with id " + id);
        }
    }
}

