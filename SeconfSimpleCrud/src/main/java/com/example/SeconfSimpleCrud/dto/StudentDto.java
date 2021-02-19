package com.example.SeconfSimpleCrud.dto;

public class StudentDto {
	
	private long id;
	private String firstname;
	private String lastname;
	private String middlename;
	private String school;
	private String std;
	private String parentcontact;
	private String token;
	private String studentname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
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
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
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
		return "StudentDto [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", middlename="
				+ middlename + ", school=" + school + ", std=" + std + ", parentcontact=" + parentcontact + ", token="
				+ token + ", studentname=" + studentname + "]";
	}
	public StudentDto(long id, String firstname, String lastname, String middlename, String school, String std,
			String parentcontact, String token, String studentname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
		this.school = school;
		this.std = std;
		this.parentcontact = parentcontact;
		this.token = token;
		this.studentname = studentname;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
