package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;

public class DepartmentDTO {

	 private Long id;
	 private String name;
	 
	 
	public DepartmentDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public DepartmentDTO(Department dt) {
		id = dt.getId();
		name = dt.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
