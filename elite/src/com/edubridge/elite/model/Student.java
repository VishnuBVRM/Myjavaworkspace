package com.edubridge.elite.model;

public class Student {
	
	private int StudentId;
	private String StudentName;
	private String StudentEmailId;
	private long StudentPhoneNumber;
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, String studentEmailId, long studentPhoneNumber) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentEmailId = studentEmailId;
		StudentPhoneNumber = studentPhoneNumber;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentEmailId() {
		return StudentEmailId;
	}
	public void setStudentEmailId(String studentEmailId) {
		StudentEmailId = studentEmailId;
	}
	public long getStudentPhoneNumber() {
		return StudentPhoneNumber;
	}
	public void setStudentPhoneNumber(Long studentPhoneNumber) {
		StudentPhoneNumber = studentPhoneNumber;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentEmailId=" + StudentEmailId
				+ ", StudentPhoneNumber=" + StudentPhoneNumber + "]";
	}
	     
}