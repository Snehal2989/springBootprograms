package com.cjc.main.Service;

import java.util.List;

import com.cjc.main.model.Student;

public interface HomeService {

	public void save(Student s);

	public List<Student> getAlldata(Student s);

	public List<Student> getAlldata(String sname, String slast);

	public List<Student> logincheck(String sname, String slast);

	public Void del(Student s1);

	public List<Student> getAlldata();

	public Student edit(Student s1);

	//public void getAlldata(Student s);



}
