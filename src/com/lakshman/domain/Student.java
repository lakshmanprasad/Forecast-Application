package com.lakshman.domain;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="Student")
public class Student {

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String tel;

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Student()
	{
		
	}
	
	public Student(String id, String firstName, String lastName, String email,String tel)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.tel = tel;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
/*	public String toString() {
		  return "User [userid=" + id + ", firstName=" + firstName
		    + ", lastName=" + lastName + ", email="
		    + email + "]";
		 }*/
}
