package com.devmarrima.person_ptm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmarrima.person_ptm.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
