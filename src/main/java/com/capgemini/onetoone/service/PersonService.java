package com.capgemini.onetoone.service;

import java.util.Set;

import com.capgemini.onetoone.entity.Person;

public interface PersonService {

	public void addNew(Person person);

	public Person getPersonById(int personId);
	
	public void oneToManyAddition(Set<Person> person);


}
