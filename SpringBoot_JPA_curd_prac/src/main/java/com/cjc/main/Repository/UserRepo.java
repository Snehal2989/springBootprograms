package com.cjc.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

	public User findByUnameAndPass(String uname, String pass);

	//public User loginCheck(String uname, String pass);

	

}
