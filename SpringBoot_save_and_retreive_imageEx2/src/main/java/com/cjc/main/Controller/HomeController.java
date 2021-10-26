package com.cjc.main.Controller;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.Model.Person;
import com.cjc.main.domain.Response;
import com.cjc.main.service.Personservice;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@CrossOrigin("*")
@RestController
public class HomeController {
	
	
	@Autowired 
	Personservice ps;
	
	@PostMapping("/saveUserprofile")
	public ResponseEntity<Response> saveuserprofile(@RequestParam("file") MultipartFile file,@RequestParam("user") String user) throws IOException 
	{
		Person pp=new ObjectMapper().readValue(user,Person.class);
		pp.setLogo(file.getBytes());
		pp.setFilename(file.getOriginalFilename());
		pp.setCreatedDate(new Date());
		
		Person d1= ps.save(pp);
		if(d1!=null )
		{
			return new ResponseEntity<Response>(new Response("User is savd"),HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Response>(new Response("User is not savd"),HttpStatus.BAD_REQUEST);
		}
		
	}


}