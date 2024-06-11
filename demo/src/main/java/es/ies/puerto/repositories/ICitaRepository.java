package es.ies.puerto.repositories;

import es.ies.puerto.modelo.entities.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICitaRepository extends MongoRepository<Cita,String> {
   
}
