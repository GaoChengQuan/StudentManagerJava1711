package com.situ.student.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.situ.student.entity.Student;
import com.situ.student.service.IStudentService;
import com.situ.student.service.impl.StudentServiceImpl;

/**
 * Controller层作用：
 * 1、获取界面上的数据，例如add(String name,int age....)，然后封装成Student
 * 2、为界面展示提供数据，例如：List<Student> findAll();
 * 真正完成功能还是要调用Service完成。
 * 后期Controller做的功能会有SprinMVC、Struts2框架帮助我们完成。
 */
public class StudentController {
	private IStudentService studentService = new StudentServiceImpl();

	public List<Student> findAll() {
		return studentService.findAll();
	}

	public int add(String name, Integer age, String gender, 
			String address, String birthday) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = simpleDateFormat.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student student = new Student(name, age, gender, address, date, new Date());
		return studentService.add(student);
	}
	
}
