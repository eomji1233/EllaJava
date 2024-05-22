package org.ella.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop3 {

	public static void main(String[] args) {
		// 3번
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

		int num, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력해주세요 : ");
		num = sc.nextInt();
		// 입력을 받았고 입력받은 값까지 1부터 더해야 함.
		// 누적함 -> sum 변수 선언
		// 누적합식은 sum += input
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (i = 1; i <= num; i++) { 	// 1부터 입력한 값까지 증가하며 반복을 해야되기 때문에
											// int i = 1; 이고, 조건식의 최댓값은 입력받은 값이어야 함. i는 증가(++)
				sum = sum + i;				// 1부터 입력한 값까지 더해주는 식
				if (i != num) System.out.print(i+"+"); 	// +로 연결
				else System.out.print(i+"="); 			// 마지막은 =으로 연결
			}
		}
		System.out.println(sum);
		System.out.println("총합 : " + sum);
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		System.out.printf("1부터 %d까지의 합 : %d\n", num, sum);
		
	}
}
