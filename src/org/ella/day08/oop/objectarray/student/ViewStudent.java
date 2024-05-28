package org.ella.day08.oop.objectarray.student;

import java.util.Scanner;

public class ViewStudent {
	
	public Student [] displayInput() {
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		for (int i = 0; i < students.length; i++) {
			System.out.print("이름 :");
			String name = sc.next();
			System.out.print("첫번째 점수 : ");
			int firstScore = sc.nextInt();
			System.out.print("두번째 점수 : ");
			int secondScore = sc.nextInt();
			students[i] = new Student(name, firstScore, secondScore);
			// 배열에 들어간 이상 배열에서 꺼내서 써야한다

		}
		return students;
	}
	
	public void displayInfo(Student [] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString()); // 이 자체가 new student
		}
	}

	public void displayMsg(String message) {
		System.out.println(message);

	}
	public int StudentMenu() {
		System.out.println("===== 메인메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}
}
