package com.designpatterns.mvc;

public class StudentView {
	public void displayStudentDetails(Student student) {
		System.out.println("Student name: "+student.getName()+" "+student.getSurname());
		System.out.println("Student number:"+ student.getNumber());
	}
}
