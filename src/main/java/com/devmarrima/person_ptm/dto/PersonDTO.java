package com.devmarrima.person_ptm.dto;

import com.devmarrima.person_ptm.entities.Person;

public class PersonDTO {
	private Long id;
	private String name;
	private Double salary;
	private Long departmentId;
	
	
	
	public PersonDTO() {

	}

	public PersonDTO(Person entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.salary = entity.getSalary();
		this.departmentId = entity.getDepartment().getId();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public Long getDepartmentId() {
		return departmentId;
	}
	
	
	
	

}
