package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.impl.StudentServiceImpl;

@Controller
public class StudentController {
	
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@RequestMapping(value="/student/{id}")
	public String removeStudent(@PathVariable("id") int id){
		boolean status=studentServiceImpl.remove();
		System.out.println(status);
		return "index";
	}
}
