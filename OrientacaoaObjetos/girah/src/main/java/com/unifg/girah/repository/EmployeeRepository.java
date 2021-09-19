package com.unifg.girah.repository;

import com.unifg.girah.model.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository 
			extends CrudRepository<EmployeeEntity, Integer> {

}
