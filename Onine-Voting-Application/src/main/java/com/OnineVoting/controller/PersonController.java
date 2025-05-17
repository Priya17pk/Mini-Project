package com.OnineVoting.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnineVoting.entity.Person;
import com.OnineVoting.service.PersonService;

@RestController
@RequestMapping("/api/voting")
public class PersonController {
    @Autowired
    private PersonService personservice;
    

    @PostMapping("/add")
    public Person insert(@RequestBody Person person) {
        return personservice.create(person);
    }
    //checking process
    @GetMapping("get")
    public String getVotingInfo() {
        return "Voting info retrieved successfully!";
    }
    
    //ReadAllList
    @GetMapping("/list")
    
    public List<Person>getAllPersons()
    {
    	return personservice.getAllPersons();
    }
    
    //Read by ID
    @GetMapping("/{id}")
    public Optional<Person>getbyid(@PathVariable int id)
    {
    	return personservice.getbyid(id);
    }
    
    //update 
    
    @PutMapping("/{id}")
    public Person update( @RequestBody Person person)
    {
    	 personservice.update(person);
    	 return person;
    }
    
    //delete
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id)
    {
    	personservice.delete(id);
    }

}
