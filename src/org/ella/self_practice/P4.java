package org.ella.self_practice;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		char grade=0;
		if (score < 0 || score > 100) {
			System.out.println("0~100 사이의 수를 입력해주세요.");
		} else {
			if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		}
		if (score>=0 && score<=100) System.out.println("학점은 " + grade + "입니다.");
	}
}
