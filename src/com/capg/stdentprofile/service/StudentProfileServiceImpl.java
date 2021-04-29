package com.capg.stdentprofile.service;

import java.util.List;

import com.capg.studentprofile.dao.StudentProfileDao;
import com.capg.studentprofile.dao.StudentProfileDaoImpl;
import com.capg.studentprofile.model.Student;

public class StudentProfileServiceImpl implements StudentProfileService {

	private StudentProfileDao dao= new StudentProfileDaoImpl();
	@Override
	public void addStudentDetails(Student student) {
		 dao.addStudentDetails(student);
	}
	
    @Override
	public Student getStudentByRollNumber(Integer studentRollNumber) {
    	return dao.getStudentByRollNumber(studentRollNumber);
	}

	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

	public List<Student> getAllStudentsByCourse(String courseName) {
		
		return dao.getAllStudentsByCourse(courseName);
	}
	
	}
