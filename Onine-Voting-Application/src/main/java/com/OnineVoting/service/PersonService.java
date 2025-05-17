package com.OnineVoting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnineVoting.entity.Person;
import com.OnineVoting.repository.PersonRep;
@Service
public class PersonService {
	@Autowired
	private PersonRep rep;
	
	
public Person create(Person p)
{
	return rep.save(p);
}

//Read list
public List<Person> getAllPersons() {

	return rep.findAll();
}


//id
public Optional<Person>getbyid(int id){
	
	return rep.findById(id);
}


//delete

public void delete(int id)
{
	rep.deleteById(id);
}

public Person update(Person person) {

	return rep.save(person);
}

}