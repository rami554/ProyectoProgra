package com.arte.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.arte.entity.Exposicion;;

@Repository
public interface ExposicionRepository extends CrudRepository<Exposicion, Integer> {

}
