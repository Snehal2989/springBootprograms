package com.cjc.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Repository.HomeRepo;
import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Student;

@Service
public class HomeServiceImpl implements HomeService{

	
	@Autowired
	HomeRepo hr;
	
	@Override
	public void save(Student s) {
	
		hr.save(s);
		
	}

	@Override
	public List<Student> getAlldata(Student s) {
		
		System.out.println(s.getSname()+"--------");
		
		return hr.findAll();
	}

	@Override
	public List<Student> getAlldata(String sname, String slast) {
		
		return hr.findAllBySnameAndSlast(sname,slast);
	}

	@Override
	public List<Student> logincheck(String sname, String slast) {
		
		return hr.findAll();
	}

	

	@Override
	public List<Student> getAlldata() {

    return   hr.findAll();
		
	}

	@Override
	public Void del(Student s1) {
		 hr.delete(s1);
		return null;
	}

	@Override
	public Student edit(Student s1) {
		
		return hr.save(s1);
		
	}

	

//	@Override
//	public  void getAlldata(Student s) {
//		
//		System.out.println(s.getSname());
//		 hr.findAll();
//		
//	}

}
