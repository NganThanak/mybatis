package com.example.service;

import java.util.ArrayList;

import com.example.entitty.Student;

public interface StudentInterface {
	
	public boolean remove();
	
	public boolean  update();
	
	public boolean save();
	
	public ArrayList<Student> findAll();
	
	public Student findOne();
	
}
