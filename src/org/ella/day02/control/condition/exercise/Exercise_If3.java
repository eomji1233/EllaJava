package org.ella.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수를 입력받아 등급을 알려주는 프로그램
		// 점수를 입력해주세요 : 92
		// 학점은 A입니다.
		// 단, 점수는 0 ~ 100 사이의 수를 입력하도록 함
		// 점수를 입력해주세요 : 102
		// 0 ~ 100 사이의 수를 입력해주세요
		// 커트라인 (90~100 : A, 89~80 : B, 79~70 : C, 69~60 : D, 그 외 F
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		if (score<=0 || score>=101) { 
			System.out.println("0~100 사이의 수를 입력해주세요.");
		} else if (score>=90) {
			System.out.println("A등급입니다.");
		} else if (score>=80) {
			System.out.println("B등급입니다.");
		} else if (score>=70) {
			System.out.println("C등급입니다.");
		} else if (score>=60) {
			System.out.println("D등급입니다.");
		} else if (score>0) {
			System.out.println("F등급입니다.");
			}
		}
}




