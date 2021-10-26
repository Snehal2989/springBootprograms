package com.cjc.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Student;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String msg()
	{
		return "Welcome to Curd onetoone operation";
	}
	
	@RequestMapping("/s")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/Register")
	public String prereg()
	{
		return "Register";
	}
	
	@RequestMapping("/reg")
	public String save(@ModelAttribute Student s)
	
	{
		hs.save(s);
		return "login";
	}

	
//	@RequestMapping("/log")
//	public String login()
//	{
//		hs.getAlldata();
//		return "success";
//	}
	
//	@RequestMapping("/log")
//	public String login(@ModelAttribute Student s,Model m)
//	{
//		hs.getAlldata(s);
//		
//		return "success";
//	}
	
	
//	@RequestMapping("/log")
//	public String login(@ModelAttribute Student s,Model m)
//	{
//		List<Student> st1=hs.getAlldata(s);
//		m.addAttribute("data",st1);
//		System.out.println(s.getSname());
//		return "success";
//	}
	
	@RequestMapping("/log")
	public String login(@RequestParam String sname,@RequestParam String slast,Model m)
	
	{
		List<Student> s=hs.logincheck(sname,slast);
		if(s!=null)
		{
		List<Student> st1=hs.getAlldata(sname,slast);
		m.addAttribute("data1",s);// for sname,slast name second variable is s if u write st1 not showing result
		//System.out.println(s.getSname());
		return "success";
		}
		return "login";
	}
	
	@RequestMapping("/del")
	public String del(@ModelAttribute Student s1,Model m)
      {
		
		hs.del(s1);
		
		List<Student> s=hs.getAlldata();
		m.addAttribute("data1",s);
		return "success";
		
	}
	
	
	@RequestMapping("/edit")
	public String edit(@ModelAttribute Student s1,Model m)
	{
		Student s=hs.edit(s1);
		if(s!=null)
		{
			List<Student> list = hs.getAlldata();
			m.addAttribute("s1", s);
			return "update";
		}
		else
		{
			List<Student> list = hs.getAlldata();
			m.addAttribute("s1", list);
			return "success";
		}
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Student s)
	{
		hs.save(s);
		return "success";
	}
}
