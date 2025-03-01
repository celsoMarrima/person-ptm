package com.devmarrima.person_ptm.dto;

import com.devmarrima.person_ptm.entities.Department;

public class DepartmentDTO {
	private Long id;
	private String name;
	
	
	
	public DepartmentDTO() {
		
	}

	public DepartmentDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDTO(Department entity) {
		id = entity.getId();
		name = entity.getName();
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
