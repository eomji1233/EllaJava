package org.ella.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2 {

	public static void main(String[] args) {
		// 2번
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.

		int num, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력해주세요 : ");
		num = sc.nextInt();
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (i = num; i >= 1; i--) { // 거꾸로 출력하기 위해 초기값을 1부터 시작하지 않음.
				System.out.print(i + " ");
			}
		}
	}
}
