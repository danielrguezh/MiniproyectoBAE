package es.ies.puerto.repositories;

import es.ies.puerto.modelo.entities.Medico;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicoRepository extends MongoRepository<Medico,String> {

}
