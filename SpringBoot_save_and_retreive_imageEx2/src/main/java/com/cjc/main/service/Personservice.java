package com.cjc.main.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Model.Person;
import com.cjc.main.Repository.PersonRepo;

@Service
@Transactional
public class Personservice {
	
	@Autowired
	PersonRepo pr;

	public Person save(Person pp) {
		
		return pr.save(pp);
	}

}
