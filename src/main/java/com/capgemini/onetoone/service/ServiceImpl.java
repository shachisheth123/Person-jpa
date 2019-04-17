package com.capgemini.onetoone.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onetoone.dao.PersonDao;
import com.capgemini.onetoone.entity.Person;

@Service
public class ServiceImpl implements PersonService {

	@Autowired
	PersonDao person;

	@Override
	public void addNew(Person person1) {
		person.save(person1);

	}

	@Override
	public Person getPersonById(int personId) {
		return person.findById(personId).get();

	}

	@Override
	public void oneToManyAddition(Set<Person> person3) {
		person.saveAll(person3);
	}
}
