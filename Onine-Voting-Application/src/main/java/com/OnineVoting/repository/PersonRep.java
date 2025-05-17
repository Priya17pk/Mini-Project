package com.OnineVoting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OnineVoting.entity.Person;
@Repository
public interface PersonRep extends JpaRepository<Person, Integer> {

}
