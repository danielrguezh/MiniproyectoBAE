package es.ies.puerto.repositories;

import es.ies.puerto.modelo.entities.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends MongoRepository<Paciente,String> {
}
