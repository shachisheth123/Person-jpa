package com.capgemini.onetoone.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Certificate {
	@Id
	private int certificateID;
	private String certificateName;

	@ManyToOne
	private Person person;

	public Certificate(int certificateID, String certificateName) {
		super();
		this.certificateID = certificateID;
		this.certificateName = certificateName;

	}

	public Certificate() {

		super();
	}

	public int getCertificateID() {
		return certificateID;
	}

	public void setCertificateID(int certificateID) {
		this.certificateID = certificateID;
	}

	public String getCertifiacteName() {
		return certificateName;
	}

	public void setCertifiacteName(String certifiacteName) {
		this.certificateName = certifiacteName;
	}

}
