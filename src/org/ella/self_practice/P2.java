package org.ella.self_practice;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		// While문을 이용하여 -1이 입력될 때 까지
		// 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		while (i < 10) {
			System.out.print("정수를 입력해주세요 : ");
			int num = sc.nextInt();
			sum += num;
			if (num == -1)
				break;
			i++;
		}
		System.out.println(sum);
		///////////////////////////////////////////////////
		System.out.print("정수를 입력해주세요 : ");
		int input = sc.nextInt();
		while (input != -1) {
			System.out.print("정수를 입력해주세요 : ");
			input = sc.nextInt(); // Duplicate local variable input 데이터타입중복오류
			sum+=input;
		}
		System.out.print(sum);
		///////////////////////////////////////////////////		
		int lastNum;
		System.out.print("정수를 입력해주세요 : ");
		while((lastNum = sc.nextInt()) != -1) {
			System.out.print("정수를 입력해주세요 : ");
			sum+=lastNum;
		}
		System.out.print(sum);
	}
}
