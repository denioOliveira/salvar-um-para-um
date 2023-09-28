package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;

	@Transactional
	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		
		Department dep = new Department();
		dep.setId(dto.getDepartment().getId());
		
		entity.setDepartment(dep);
		entity = repository.save(entity);
		
		return new PersonDepartmentDTO(entity);
		
	}
	
}
