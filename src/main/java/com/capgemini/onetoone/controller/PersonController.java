package com.capgemini.onetoone.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetoone.entity.Certificate;
import com.capgemini.onetoone.entity.Person;
import com.capgemini.onetoone.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService service;

	@RequestMapping("/profile")
	public Person sayHello() {
		// Person person = new Person(101, "shachi", new Profile(200,"good"));

		// Person person=new Person(101,"shachi" ,new Certificate([[120,"JAVA"], [200,
		// ".NET"]]));

		// Set<Certificate> certificates = new HashSet<Certificate>();
		// certificates.add(100);

		// service.addNew(person);
		// return person;

		Set cer = new HashSet<Certificate>() {
			{
				add(new Certificate(101, "JAVA"));
				add(new Certificate(102, ".Net"));

			}
		};

		Person person = new Person(101, "shachi", cer);

		service.addNew(person);
		return person;

	}

	@RequestMapping("/list")
	public Set<Person> show() {

		Set<Person> personList = new HashSet<Person>();

		Certificate certification1 = new Certificate(102, "java");
		Certificate certification2 = new Certificate(103, "python");
		Certificate certification3 = new Certificate(104, ".net");
		Certificate certification4 = new Certificate(105, "ruby");

		Set<Certificate> certifications = new HashSet<>();
		certifications.add(certification1);
		certifications.add(certification2);

		Set<Certificate> certifications2 = new HashSet<>();
		certifications2.add(certification4);
		certifications2.add(certification3);

		Person p1 = new Person(101, "shachi", certifications);
		Person p2 = new Person(102, "rasika", certifications);

		personList.add(p1);
		personList.add(p2);

		return personList;
	}

	@RequestMapping("/show")
	public Person showPerson() {
		return service.getPersonById(101);
	}

}
