package com.springapp.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="person_id")
	private int person_id;
	@NotNull(message = "To pole nie moze być puste")
	@Size(min = 3,message = "Za krótkie imię")
	@Column(name="firstName")
	private String firstName;
	@Size(min = 3,message = "Za krótkie imię")
	@NotNull(message = "To pole nie moze być puste")
	@Column(name="lastName")
	private String lastName;
	@Size(min = 3,message = "Za krótkie imię")
	@NotNull(message = "To pole nie moze być puste")
	@Column(name="email")
	private String email;
	public Person() {
		super();
	}

	public Person(@NotNull String firstName, @NotNull String lastName, @NotNull String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
