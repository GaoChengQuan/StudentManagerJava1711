package com.situ.student;

import com.situ.student.view.StudentView;

/**
 * 启动应用程序的类
 */
public class StudentApp {
	public static void main(String[] args) {
		StudentView studentView = new StudentView();
		studentView.showView();
	}
}
