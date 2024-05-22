package org.ella.day04.control.roop.exercise;

import java.util.Scanner;

public class Exercise_Loop1 {

	public static void main(String[] args) {
		// 1번
		// 1부터 사용자에게 입력 받은 수까지 중에서
		// 1) 2와 3의 배수를 모두 출력하고
		// 2) 2와 3의 공배수의 개수를 출력하세요.

		int num, i, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력해주세요 : ");
		num = sc.nextInt();
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (i = 1; i <= num; i++) {
				if (i%2==0 || i%3==0) {
					System.out.println(i);
					if (i%6==0) {
						count++;
				}
			}
		}
			System.out.println("공배수의 개수는 : " + count);
	}
}
}