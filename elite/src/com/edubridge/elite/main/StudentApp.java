package com.edubridge.elite.main;

import com.edubridge.elite.model.Student;

import com.edubridge.elite.service.StudentService;

public class StudentApp {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		Student[] student = service.getAllStudents();
		
		for(Student students : student) {
			System.out.println(student);
		}
	}
}
