package com.example.entitty;

public class Student {
	
	private int id;
	private String name;
	private String gender;
	private double score;
	
	public Student(){
		
	}
	public Student(int id, String name, String gender, double score) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
}