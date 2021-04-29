package com.capg.stdentprofile.service;

import java.util.List;

import com.capg.studentprofile.model.Student;

public interface StudentProfileService {
	void addStudentDetails(Student student);
	Student getStudentByRollNumber(Integer studentRollNumber);
	List<Student> getAllStudents();
	List<Student> getAllStudentsByCourse(String courseName);

}
