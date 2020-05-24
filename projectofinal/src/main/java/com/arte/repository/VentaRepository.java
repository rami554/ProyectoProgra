package com.arte.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.arte.entity.Venta;

@Repository
public interface VentaRepository extends CrudRepository<Venta, Integer>{

}
