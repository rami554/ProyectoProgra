package com.arte.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.arte.entity.Obraexpo;

@Repository
public interface ObraExpoRepository extends CrudRepository<Obraexpo, Integer> {

}
