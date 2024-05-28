package org.ella.day08.oop.student;

import java.util.Scanner;

public class ManageStudent {
	// 멤버 필드
	int kor;
	int eng;
	int math;

	// 생성자
	public ManageStudent() {}

	// 멤버 메소드
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
	}

	public void printScore() {
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + kor); // static 필드에서는 non-static을 쓸 수 없음
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("총점 : " + (kor + math + eng));
		System.out.println("평균 : " + (kor + math + eng) / 3.0);

	}
}
