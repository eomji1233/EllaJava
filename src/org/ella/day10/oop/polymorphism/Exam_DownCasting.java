package org.ella.day10.oop.polymorphism;

class Person {
	String name;
	String id;
	
	public Person() {}
	public Person(String name, String id) { // 오버로딩
		this.name = name;
		this.id = id;
	}
}

class Student extends Person{
	String grade;
	String department;
	
	public Student() {
		
	}
	public Student(String grade, String department) { // 오버로딩
		this.grade = grade;
		this.department = department;
	}
}

public class Exam_DownCasting {

	public static void main(String[] args) {
		Person p = new Student(); 	// 업캐스팅 / 어쨋거나 Person 타입의 변수이기 때문에 Student의 메소드를 이용할 수 없음
									// 상속관계인 경우에 가능
		System.out.println(p.name);
		System.out.println(p.id);
		
		// 다운캐스팅 - 강제 형 변환을 통해 자식 메소드를 받는 것!
		System.out.println(((Student)p).grade); // grade cannot be resolved or is not a field
		System.out.println(((Student)p).department); // department cannot be resolved or is not a field
	}
	
}
