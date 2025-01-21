package com.devmarrima.person_ptm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmarrima.person_ptm.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
