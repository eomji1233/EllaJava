package org.ella.day04.array;

public class Exam_Array {

	public static void main(String[] args) {
		int num; // 변수의 선언
		num = 1; // 변수의 초기화
		
		int [] nums; // 배열의 선언
		nums = new int[10]; // 배열의 생성(할당)
		nums[0] = 1; // 배열의 초기화
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[9]);
		System.out.println(nums.length); // 배열의 길이를 알 수 있음
		
		for(int i = 0; i < 10; i++) {
			System.out.println(nums[i]);
		}
	}

}
