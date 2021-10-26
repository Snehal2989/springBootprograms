package com.cjc.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.Repository.UserRepo;
import com.cjc.main.Service.UserService;
import com.cjc.main.model.User;

@Controller
public class UserController {

	@Autowired
	UserService us;
	
	@RequestMapping("/")
	public String msg()
	{
		return "Welcome";
	}
	
	
	@RequestMapping("/lg")
	public String prelogin()
	{
		return "login";
	}
	
	
	@GetMapping("/Register")
	public String prereg()
	{
		return "Register";
	}
	
	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute User u)
	{
		us.save(u);
		return "Save the user";
	}
	
	@RequestMapping("/log")
	public String loginCheck(@RequestParam String uname,@RequestParam String pass,Model m)
	{
		System.out.println("Username is "+uname);
		System.out.println("Password is "+pass);
		
		User u=us.loginCheck(uname,pass);
		if(u!=null)
		{
			List<User> u1=us.getAllData();
			m.addAttribute("data",u1);
			return "success";
		}
		
		return "login";
	}
	
	@RequestMapping("/delete")
	public String del(@ModelAttribute User u,Model m)
	{
		us.delete(u);
		List<User> u1 = us.getAllData();
		m.addAttribute("data",u1);
		return "success";
			
	}
	
	@RequestMapping("/edit")
	public String editing(@ModelAttribute User u,Model m)
	{
		User usr=us.editUser(u);
		if(usr!=null)
		{
	List<User> u2=us.getAllData();
		m.addAttribute("u",usr);
		return "update";
		}
		else
		{
			List<User> u2=us.getAllData();
			m.addAttribute("u",u2);
			return "success";
		}
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute User u,Model m)
	{
		us.save(u);
		List<User> u1 = us.getAllData();
		m.addAttribute("data",u1);
		return "success";
	}
	
	
}
