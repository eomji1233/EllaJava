package org.ella.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop4 {

	public static void main(String[] args) {
		// 4번
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		int num1, num2, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값을 입력해주세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 값을 입력해주세요 : ");
		num2 = sc.nextInt();
		if (num1 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else if (num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			// 입력된 두 개의 값 중 작은값은 초기식에 큰 값은 조건식에 입력되도록 만들기!
			// 힌트, min, max를 사용하는 방법도 있음.
			for (i = num1; i < num2; i++) { // num1 무조건 num2보다 작다고 가정
				System.out.print(i + " ");
			}
		}
	}
}
