package org.ella.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {

	static int kor = 0;
	static int math = 0;
	static int eng = 0; 	// ScoreProgram2 클래스의 멤버필드

	public static void main(String[] args) {
		finish: while (true) {
			int choice = printMenu(); // 프린트메뉴 메소드에서 값받아오기

			switch (choice) {
			case 1:
				inputScore();
				break;
			case 2:
				printScore();
				break;
			case 3:
				displayMsg("프로그램을 종료합니다");
				break finish;
			default:
				displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
	private static void displayMsg(String message) { 
		// 매개변수 있을 때만 괄호안에 넣기 / 종료한다, 사이수를 입력하라는 전달값을 받을거야
		System.out.println(message);
	}
	// ScoreProgram2 클래스의 멤버메소드
	private static void printScore() {
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + kor); 		// static 필드에서는 non-static을 쓸 수 없음
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("총점 : " + (kor + math + eng));
		System.out.println("평균 : " + (kor + math + eng) / 3.0);

	}

	private static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();

	}

	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice; // return을 안쓰면 값이 사라짐 / void 대신에 return값의 데이터타입 써주기
	}
}
