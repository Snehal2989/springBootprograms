package com.cjc.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Repository.UserRepo;
import com.cjc.main.Service.UserService;
import com.cjc.main.model.User;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepo ur;
	
	@Override
	public void save(User u) {
	
		ur.save(u);
		
	}

	@Override
	public User loginCheck(String uname, String pass) {
		
		return ur.findByUnameAndPass(uname,pass);
	}

	@Override
	public List<User> getAllData() {
		
		return ur.findAll();
		
	}

	@Override
	public void delete(User u) {
		
		 ur.delete(u);
		
	}

	@Override
	public User editUser(User u) {
	
		return ur.save(u);
		
	}

}
