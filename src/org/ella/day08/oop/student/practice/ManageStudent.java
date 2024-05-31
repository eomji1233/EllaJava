package org.ella.day08.oop.student.practice;

import java.util.Scanner;

public class ManageStudent {
	static int kor;
	static int eng;
	static int math;

	public void ManageStudent() {}

	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
	}

	public void printScore() {
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor + eng + math));
		System.out.println("국어 : " + (kor + eng + math) / 3.0);
		
	}
	
	
	
	
}
