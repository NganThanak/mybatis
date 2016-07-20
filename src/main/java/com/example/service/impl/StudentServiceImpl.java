package com.example.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entitty.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentInterface;

@Service
public class StudentServiceImpl implements StudentInterface {
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public boolean remove() {
		studentRepository.remove(2);
		return false;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Student> findAll() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student findOne() {
		// TODO Auto-generated method stub
		return null;
	}

}
