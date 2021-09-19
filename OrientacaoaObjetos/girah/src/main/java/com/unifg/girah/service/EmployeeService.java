package com.unifg.girah.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unifg.girah.exception.RecordNotFoundException;
import com.unifg.girah.model.EmployeeEntity;
import com.unifg.girah.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	public List<EmployeeEntity> getAllEmployees()
	{
		List<EmployeeEntity> result = (List<EmployeeEntity>) repository.findAll();
		
		if(result.size() > 0) {
			return result;
		} else {
			return new ArrayList<EmployeeEntity>();
		}
	}
	
	public EmployeeEntity getEmployeeById(Integer id) throws RecordNotFoundException
	{
		Optional<EmployeeEntity> employee = repository.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}
	
	public EmployeeEntity createOrUpdateEmployee(EmployeeEntity entity) 
	{
		if(entity.getMatricula()  == null)
		{
			entity = repository.save(entity);
			
			return entity;
		} 
		else 
		{
			Optional<EmployeeEntity> employee = repository.findById(entity.getMatricula());
			
			if(employee.isPresent()) 
			{
				EmployeeEntity newEntity = employee.get();
				newEntity.setNome(entity.getNome());
				newEntity.setMatricula(entity.getMatricula());
				newEntity.setCpf(entity.getCpf());
				newEntity.setDataNascimento(entity.getDataNascimento());
				newEntity.setDataContratacao(entity.getDataContratacao());
				newEntity.setCargo(entity.getCargo());
				newEntity.setEquipe(entity.getEquipe());

				newEntity = repository.save(newEntity);
				
				return newEntity;
			} else {
				entity = repository.save(entity);
				
				return entity;
			}
		}
	} 
	
	public void deleteEmployeeById(Integer id) throws RecordNotFoundException
	{
		Optional<EmployeeEntity> employee = repository.findById(id);
		
		if(employee.isPresent()) 
		{
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	} 
}