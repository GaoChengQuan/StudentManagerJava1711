package com.situ.student.view;

import java.util.List;
import java.util.Scanner;

import com.situ.student.controller.StudentController;
import com.situ.student.entity.Student;

/*
 * 界面，纯粹就是为了展示
 */
public class StudentView {
	private Scanner scanner = new Scanner(System.in);
	private StudentController studentController = new StudentController();
	
//	private Scanner scanner1;
//	private StudentController studentController1;
//	public StudentView() {
//		scanner1 = new Scanner(System.in);
//		studentController1 = new StudentController();
//	}
	
	public void showView() {
		while (true) {
			System.out.println("---学生信息管理学系统---");
			System.out.println("1、查询所有");
			System.out.println("2、添加");
			System.out.println("3、修改");
			System.out.println("4、删除");
			System.out.println("0、退出");
			System.out.println("请选择：");
			int selected = scanner.nextInt();
			
			if (selected == 0) {
				System.out.println("退出程序");
				break;
			}
			
			switch (selected) {
			case 1:// 查找所有
				findAll();
				break;
			case 2:// 添加

				break;
			case 3:// 修改

				break;
			case 4:// 删除

				break;

			default:
				break;
			}
		}
		
	}

	private void findAll() {
		System.out.println("StudentView.findAll()");
		List<Student> list = studentController.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
		
	}
}
