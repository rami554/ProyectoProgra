/**
 * 
 */
package com.arte.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.arte.entity.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}
