package com.capg.studentprofile.dao;

import java.util.List;

import com.capg.studentprofile.model.Student;

public interface StudentProfileDao {
	void addStudentDetails(Student student);
	Student getStudentByRollNumber(Integer studentRollNumber);
	List<Student> getAllStudents();
	List<Student> getAllStudentsByCourse(String courseName);
	
}
