package com.designpatterns.mvc;

public class StudentController {
	private Student student;
	private StudentView studentView;

	public StudentController(Student student, StudentView studentView) {
		this.student = student;
		this.studentView = studentView;
	}
	
	public String getStudentName() {
		return student.getName();
	}
	public void setStudentName(String name) {
		this.student.setSurname(name);
	}
	public String getStudentSurname() {
		return student.getSurname();
	}
	public void setStudentSurname(String surname) {
		this.student.setSurname(surname);
	}
	public int getStudentNumber() {
		return student.getNumber();
	}
	public void setStudentNumber(int number) {
		this.student.setNumber(number);
	}
	
	
	public void updateView( ) {
		studentView.displayStudentDetails(student);
	}
}
