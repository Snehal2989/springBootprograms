package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	private String slast;
	private int age;
	private String email;
	@OneToOne(cascade=CascadeType.ALL)
	private Faculty faculty;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSlast() {
		return slast;
	}
	public void setSlast(String slast) {
		this.slast = slast;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public Student(int sid, String sname, String slast, int age, String email, Faculty faculty) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.slast = slast;
		this.age = age;
		this.email = email;
		this.faculty = faculty;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
