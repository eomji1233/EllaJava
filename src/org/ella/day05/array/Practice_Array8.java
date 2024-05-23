package org.ella.day05.array;

import java.util.Scanner;

public class Practice_Array8 {

	public static void main(String[] args) {
		// 3 이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		// 다시 정수를 받도록 하세요.
//		ex.
//		정수 : 4
//		다시 입력하세요.
//		정수 : -6
//		다시 입력하세요.
//		정수 : 5
//		1, 2, 3, 2, 1
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("자연수 입력 : ");
		int [] arr = new int[num]; 
		for (int i = 1; i<num-2; i++);
		{
			arr[i] = i;
		}
		
		
		if (num < 4 || num % 2 == 0) {
			System.out.print("다시 입력하세요");
		} else {
			
		}
	}
}