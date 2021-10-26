package com.cjc.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.DaoI.HomeDao;
import com.cjc.ServiceI.HomeServiceI;
import com.cjc.model.User;

@Service
public class HomeServiceImpl implements HomeServiceI {
	
	@Autowired
	HomeDao hd; 

	

	@Override
	public int saveUser(User u) {
		
		return hd.saveUser(u);
		
	}

}
