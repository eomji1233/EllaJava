package org.ella.day04.array.practice;

public class Practice_Array2 {

	public static void main(String[] args) {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		int [] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (10-i);
			System.out.print(nums[i] + " ");
		}
	}

}
