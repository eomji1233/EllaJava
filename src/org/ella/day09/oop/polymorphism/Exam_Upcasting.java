package org.ella.day09.oop.polymorphism;


class Person {
	String name;
	String id;
	
	public Person() {}
	public Person(String name, String id) { // 오버로딩
		this.name = name;
		this.id = id;
	}
}

class Student extends Person {
	String grade;
	String department;
	
	public Student() {}
}

class Worker extends Person {
	
}

class Doctor extends Person {
	
}

public class Exam_Upcasting {

	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		p = s;
//		s = p;
		p = new Worker();
		p = new Doctor();
	}
}