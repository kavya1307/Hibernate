package com.example.SeconfSimpleCrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "stu")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String studentname;
	private String firstname;
	private String middlename;
	private String lastname;
	private String school;
	private String std;
	private String parentcontact;
	private String token;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}	
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getParentcontact() {
		return parentcontact;
	}
	public void setParentcontact(String parentcontact) {
		this.parentcontact = parentcontact;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", firstname=" + firstname + ", middlename="
				+ middlename + ", lastname=" + lastname + ", school=" + school + ", std=" + std + ", parentcontact="
				+ parentcontact + ", token=" + token + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String studentname, String firstname, String middlename, String lastname, String school,
			String std, String parentcontact, String token) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.school = school;
		this.std = std;
		this.parentcontact = parentcontact;
		this.token = token;
	}
	

	
}
