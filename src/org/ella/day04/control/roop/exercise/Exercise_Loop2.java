package org.ella.day04.control.roop.exercise;

import java.util.Scanner;

public class Exercise_Loop2 {

	public static void main(String[] args) {
		// 2번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 3
		 *
		 **
		 ***
		 **
		 *
		 */
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}