package com.situ.student.controller;

import java.util.List;

import com.situ.student.entity.Student;
import com.situ.student.service.IStudentService;
import com.situ.student.service.impl.StudentServiceImpl;

public class StudentController {
	private IStudentService studentService = new StudentServiceImpl();

	public List<Student> findAll() {
		return studentService.findAll();
	}
	
}
