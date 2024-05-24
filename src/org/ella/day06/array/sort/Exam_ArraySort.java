package org.ella.day06.array.sort;

public class Exam_ArraySort {

	public static void main(String[] args) {
		// 정렬
		// 크기가 5인 배열이 있고 24 5 7 10 23
		// 7 24 5 23 10 -> 5 7 10 23 24 (오름차순)
		// 01. 정렬 알고리즘
		// - 알고리즘이란? 문제 해결을 하기 위한 절차나 방법,
		// 프로그래밍 언어로 어떻게 해결할 것인가를 고민해 가는 것
		// 02. 정렬 알고리즘 종류
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. 병합정렬
		// 7 24 5 23 10 -> 5 7 10 23 24
		// 자리바꿈 발생!
		// 1. 자리바꿈은 어떻게 해결할 것인가?
		// 2. 어떤 조건이 만족하면 바꿀 것인가?
		int num1 = 5;
		int num2 = 7;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		// num1에는 7이 들어가고 num2에는 5가 들어가도록 해야함.
		int temp = num1;
		num1 = num2; // 5가 7이 돼서 영영 사라짐! 사라지기 전에 5를 저장해야 함!
		num2 = temp;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);

		int[] nums = { 2, 1, 3 };
		// 3 2 1이 되도록 바꿔보세요!
//		num1 = nums[0];
//		num2 = nums[2];
//		temp = num1;
//		nums[0] = num2;
//		nums[2] = temp;

		temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;

		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;

		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println(" ");
		int[] opens = { 24, 5, 7 };
		// 5 7 24

		int tempN = opens[0];
		opens[0] = opens[1];
		opens[1] = tempN;
		// 5 24 7

		tempN = opens[1];
		opens[1] = opens[2];
		opens[2] = tempN;
		// 5 7 24

		for (int num : opens) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		int[] openss = { 24, 5, 7 };
		tempN = openss[0];
		openss[0] = openss[2];
		openss[2] = tempN;
		// 7 5 24

		tempN = openss[0];
		openss[0] = openss[1];
		openss[1] = tempN;
		// 5 7 24
		
		for (int num : openss) {
			System.out.print(num + " ");
		}
	}
}
