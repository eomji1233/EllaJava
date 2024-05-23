package org.ella.day05.exception.exercise;

import java.util.Scanner;

public class Exercise_Execption1 {

	public static void main(String[] args) {
		// 문제 1 
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력 받는 프로그램을 작성하여라.
		int num1 = 0, num2 = 0;
		int result = 0;
		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = sc.nextInt();
		
		try {	
			result = num1 / num2;			
		}
		catch (ArithmeticException e){		
			System.out.println("0으로 나눌 수 없습니다!");
			continue;
			}
		System.out.printf("%d를 %d로 나눈값은 %d 입니다\n", num1, num2, result);
		}
	}
}
