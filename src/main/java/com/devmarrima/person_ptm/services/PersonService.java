package com.devmarrima.person_ptm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmarrima.person_ptm.dto.PersonDTO;
import com.devmarrima.person_ptm.dto.PersonDepartmentDTO;
import com.devmarrima.person_ptm.entities.Department;
import com.devmarrima.person_ptm.entities.Person;
import com.devmarrima.person_ptm.repositories.DepartmentRepository;
import com.devmarrima.person_ptm.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repositoy;
	
	@Autowired
	private DepartmentRepository repository;

	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		
		Department dpt = repository.getReferenceById(dto.getDepartment().getId());
		//Department dpt = new Department();
		//dpt.setId(dto.getDepartment().getId());
		
		entity.setDepartment(dpt);
		
		entity = repositoy.save(entity);

		return new PersonDepartmentDTO(entity);
	}
	
	public PersonDTO insert(PersonDTO dto) {
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		
		//Department dpt = repository.getReferenceById(dto.getDepartmentId());
		Department dpt = new Department();
		dpt.setId(dto.getDepartmentId());
		
		entity.setDepartment(dpt);
		
		entity = repositoy.save(entity);

		return new PersonDTO(entity);
	}

}
