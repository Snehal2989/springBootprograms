package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.ServiceI.HomeServiceI;
import com.cjc.model.User;

@Controller
public class HomeController {
	
	@Autowired
	HomeServiceI hs;
	
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/Register")
	public String Prereg()
	{
		return "Register";
	}

	@RequestMapping("/reg")
	public String saveUser(@ModelAttribute("user") User u)
	{
		
		System.out.println("In save method");
		System.out.println(u);
		int id = 0;
		if(u.getR1().getRname().equals("Admin"))
		{
			u.getR1().setRid(1);
			id=hs.saveUser(u);
		}
		else if(u.getR1().getRname().equals("Trainer"))
		{
			u.getR1().setRid(2);
			id=hs.saveUser(u);
			
		}
		else if(u.getR1().getRname().equals("Student"))

		{
			u.getR1().setRid(3);
			id=hs.saveUser(u);
		}
		
		if(id>0)
		{
			return "login";
		}
		else
		{
		return "Register";
		}
	}
	
}
