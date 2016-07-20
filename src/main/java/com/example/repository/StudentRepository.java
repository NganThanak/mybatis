package com.example.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.entitty.Student;


@Repository
public interface StudentRepository {
	
	@Delete("delete from student where id=#{id}")
	public boolean remove(int id);
	
	@Select("select * from student")
	@Results({
		@Result(property="id",column="id"),
		@Result(property="name",column="name"),
		@Result(property="gender",column="gender"),
		@Result(property="score",column="score")
		
	})
	public ArrayList<Student> findAll();
	
	/*@Insert("insert into student(id,name,gender,score) values(#{student.id},#{student.name},#{student.gender},#{student.score})")
	public boolean insert(Student student);*/
}
