package com.cjc.main.Service;

import java.util.List;

import com.cjc.main.model.User;

public interface UserService {

	public void save(User u);

	public User loginCheck(String uname, String pass);

	public List<User> getAllData();

	public void delete(User u);

	public User editUser(User u);

}
