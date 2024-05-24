package org.ella.day06.array.sort.exercise;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arrs = new int[5];
		for (int i = 1; i < arrs.length+1; i++) {
			System.out.print(i+"번째 정수 입력 : "); // 위에 조건식 안바꾸고 여기다가 System.out.print((i+1) + "번째 입력");으로 해도 됨!
			int num = sc.nextInt();
			arrs[i-1] = num;
		}
		for (int i = 0; i < arrs.length - 1; i++) {
			for (int j = 0; j < (arrs.length - 1) - i; j++) {
				if (arrs[j] > arrs[j + 1]) {
					int temp = arrs[j];
					arrs[j] = arrs[j + 1];
					arrs[j + 1] = temp;
				}
			}
		}
		int sum = arrs[0]+arrs[4];
		System.out.print("정렬된 결과 : ");
		for (int num : arrs) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.print("정렬 후 첫번째 수와 마지막 수의 합 : " + sum);			
	}
}
