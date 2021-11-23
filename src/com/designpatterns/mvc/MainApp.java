package com.designpatterns.mvc;

public class MainApp {
	public static void main(String[] args) {
		Student s = getStudentFromDB();
		StudentView sView = new StudentView();
		StudentController sc = new StudentController(s, sView);
		sc.updateView();
		sc.setStudentSurname("Metin Tortop");
		sc.updateView();
	}
	
	private static Student getStudentFromDB() {
		Student s = new Student();
		s.setName("Tugba");
		s.setSurname("Metin");
		s.setNumber(2020);
		return s;
	}
	
}
