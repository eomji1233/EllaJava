package org.ella.day16.exam.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

class Operator {
	public void plus() {
		int[] num = new int[2];
		for (int i = 0; i < num.length; i++) {
			num[i] = inputNumber(i);
		}
		System.out.println("두 수의 합은 : " + (num[0] + num[1]));
	}
	
	public int inputNumber(int i) {
		Scanner sc = new Scanner(System.in);
		int inputNumber = 0;
		while (true) {
			try {
				System.out.print((i + 1) + "번째 정수를 입력하세요 : ");
				inputNumber = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 정수만 입력 해주세요.");
				sc.next(); 	
			}
		}
		return inputNumber;
	}
}
public class OperatorRun {
	public static void main(String[] args) {
		new Operator().plus();
	}
}
