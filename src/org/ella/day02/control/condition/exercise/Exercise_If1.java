package org.ella.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1
		// 점수와 학년을 정수로 입력받아서 60점 이상이면 합격
		// 60점 미만이면 불합격으로 출력한다.
		// 단, 4학년의 경우 70점 이상이어야 합격을 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("학년을 입력하세요(1~4) : ");
		int grade = sc.nextInt();
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();

//		if (grade < 4 && score >= 60) {
//			System.out.println("합격입니다");
//		} else if (grade == 4 && score >= 70) {
//			System.out.println("합격입니다");
//		} else {
//			System.out.println("불합격입니다");
//		}
//	}


		// 중첩 삼항연산자
		String pass = score >= 70 && grade == 4 ? "합격" : score >= 60 ? "합격" : "불합격";

		if (grade != 4) {
			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			if (score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}

		}

	}
}
