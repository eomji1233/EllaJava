package org.ella.day04.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {

	public static void main(String[] args) {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		// 입력받고 평균을 구하는 프로그램을 작성하라
		// 단, 배열의 크기는 5이다.
		// 정수 입력 : 24
		// 정수 입력 : 10
		// 정수 입력 : 23
		// 정수 입력 : 5
		// 정수 입력 : 7
		// 평균 :

		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요 : ");
			nums[i] = sc.nextInt();
			sum += nums[i];
		}

//		sum = nums[0];
//		sum = nums[0]+nums[1];
//		sum = nums[0]+nums[1]+nums[2];
//		sum = nums[0]+nums[1]+nums[2]+nums[3];
//		sum = nums[0]+nums[1]+nums[2]+nums[3]+nums[4];

		System.out.println("평균 : " + (double)sum /nums.length);
	}

}
