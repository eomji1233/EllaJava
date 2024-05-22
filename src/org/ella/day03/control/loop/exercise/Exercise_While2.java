package org.ella.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		// While문을 이용하여 -1이 입력될 때 까지
		// 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		Scanner sc = new Scanner(System.in);
		// 정수를 10번 입력받아서 합을 출력하는 프로그램
		int i = 0;
		int sum = 0;

//		int val = 0;
//		while(val >= 0) {
//			System.out.print("정수를 입력하세요 : ");
//			val = sc.nextInt();
//			sum += val;
//		}
//		System.out.println("총합 : " + sum);
		
		///////////////////////////////////////////////////
		int val;
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			val = sc.nextInt();
			if (val == -1)
				break;
			sum += val;
		}
		System.out.println("총합 : " + sum);	
		///////////////////////////////////////////////////	
		int lastNum;
		System.out.print("정수를 입력하세요 : ");
		while ((lastNum = sc.nextInt()) != -1) {
			sum += lastNum;
		}
		System.out.println("총합 : " + sum);
		///////////////////////////////////////////////////
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		while (input != -1) {
			sum += input;
			System.out.print("정수를 입력하세요 : ");
			input = sc.nextInt();
		}
		System.out.println("총합 : " + sum);
		///////////////////////////////////////////////////
		while (i < 10) {
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();
			if (num == -1)
				break;
			sum += num;
			i++;
		}
		System.out.println("총합 : " + sum);
	}
}
		///////////////////////////////////////////////////


//		int sum = 0;
//		while (sum==0) { 
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			System.out.print("정수를 입력하세요 : ");
//			sum += num;
//			if (num==-1) {
//				System.out.println("지금까지 입력한 수의 합은 " + sum + "입니다");
//				break;
