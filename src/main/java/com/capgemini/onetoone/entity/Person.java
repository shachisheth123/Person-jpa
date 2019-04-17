package com.capgemini.onetoone.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int personId;
	private String personName;

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private Set<Certificate> certificates = new HashSet<>();


	public Person(int personId, String personName, Set<Certificate> certificates) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certificates = certificates;
	}

	public Person() {
		
		super();

	}

	/*
	 * public Person(int personId, String personName, Profile profile) { super();
	 * this.personId = personId; this.personName = personName; this.profile =
	 * profile; }
	 * 
	 * 
	 */
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Set<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(Set<Certificate> certificates) {
		this.certificates = certificates;
	}

	/*
	 * public Profile getProfile() { return profile; } public void
	 * setProfile(Profile profile) { this.profile = profile; }
	 */

	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(unique = true) private Profile profile;
	 */

}
