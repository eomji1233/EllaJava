package org.ella.day02.operator.exerscise;

import java.util.Scanner;

public class Exam_Logical2 {
	public static void main(String[] args) {
		int a = 70;
		int b = 55;
		boolean result1, result2, result3, result4;
		result1 = ((a==b) || (a++<100));
		result2 = ((a<b) && (--b<55));
		result3 = ((a!=b) && (b--<a++));
		result4 = ((a++ != b) || (b++ >= 85));
		System.out.println("결과값1 : " + result1);
		System.out.println("결과값2 : " + result2);
		System.out.println("결과값3 : " + result3);
		System.out.println("결과값4 : " + result4);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		boolean result;
		result = (num>=1 && 100>=num);
		System.out.print(result);
		scanner.close();
				
		
	}
}
