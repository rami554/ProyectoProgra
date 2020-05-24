package com.arte.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.arte.entity.Obra;

@Repository
public interface ObraRepository extends CrudRepository<Obra, Integer>{

}
