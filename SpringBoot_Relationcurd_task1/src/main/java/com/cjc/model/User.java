package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private String name;
	private String mbno;
	@OneToOne(cascade=CascadeType.ALL)
	private Login login;
	@ManyToOne(cascade=CascadeType.ALL)
	private Role r1;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMbno() {
		return mbno;
	}
	public void setMbno(String mbno) {
		this.mbno = mbno;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Role getR1() {
		return r1;
	}
	public void setR1(Role r1) {
		this.r1 = r1;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", mbno=" + mbno + ", login=" + login + ", r1=" + r1 + "]";
	}
	
	
	
}