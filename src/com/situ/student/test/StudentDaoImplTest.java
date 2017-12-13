package com.situ.student.test;

import org.junit.Test;

import com.situ.student.dao.IStudentDao;
import com.situ.student.dao.impl.StudentDaoImpl;
import com.situ.student.entity.Student;

public class StudentDaoImplTest {

	@Test
	public void testAdd() {
		IStudentDao studentDao = new StudentDaoImpl();
		Student student = new Student("xxx", 20, "男", "青岛");
		int result = studentDao.add(student);
		if (result > 0) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
}
