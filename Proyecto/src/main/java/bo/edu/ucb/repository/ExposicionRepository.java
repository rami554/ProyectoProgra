package bo.edu.ucb.repository;

import bo.edu.ucb.entitys.ExposicionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExposicionRepository extends <ExposicionEntity, Integer> {

}
