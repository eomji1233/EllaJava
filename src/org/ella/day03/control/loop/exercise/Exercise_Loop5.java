package org.ella.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop5 {

	public static void main(String[] args) {
		// 5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.

		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int dan = sc.nextInt();
		for (i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}
}