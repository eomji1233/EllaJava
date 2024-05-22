package org.ella.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop6 {

	public static void main(String[] args) {
		// 6번
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		// 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.

		int i, n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int dan = sc.nextInt();
		if (dan > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요");
		} else {
			for (n = dan; n <= 9; n++) {
				for (i = 1; i <= 9; i++) {
					System.out.println(n + "*" + i + "=" + dan * i);
				}
			}
		}
	}
}