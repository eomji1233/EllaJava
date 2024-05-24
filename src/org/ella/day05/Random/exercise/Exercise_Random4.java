package org.ella.day05.Random.exercise;

import java.util.Scanner;

public class Exercise_Random4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 100 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 100 || num < 1) {
			System.out.println("1 ~ 100 사이의 정수를 입력하세요!");
		} else if (num == 1) {
			System.out.println("1은 소수가 아닙니다.");
		} else {
			if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) { // 2,3,5,7로 나누었을 때 나머지가 있으면 소수(2, 3은 제외)
				System.out.println(num + "은(는) 소수가 아닙니다.");
			} else if (num == 2 || num == 3 || num == 5 || num == 7) {
				System.out.println(num + "은(는) 소수입니다.");
			} else {
				System.out.println(num + "은(는) 소수입니다.");
			}
		}
	}
}
