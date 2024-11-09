package com.edubridge.elite.service;

import com.edubridge.elite.model.Student;

public class StudentService {

		Student[] students;
		
		public StudentService() {
			students = new Student[] {
					new Student(1001, "Vishnu", "vishnu@gmail.com", 9988776655L),
					new Student(2002, "Vardhan", "vardhan@gmail.com", 8877665544L),
					new Student(3003, "Chintala", "chintala@gmail.com", 7766554433L),
					new Student(4004, "Chowdary", "chowdary@gmail.com", 6655443322L),
			};
			}
		public Student[] getAllStudents() {
			return students;
		}


	}


