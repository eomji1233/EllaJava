package org.ella.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1 {

	public static void main(String[] args) {
		// 1번
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		int num, i = 0;
		Scanner sc = new Scanner(System.in); 		// 사용자로부터 입력받기 위한 준비
		System.out.print("값을 입력해주세요 : "); 	// 가이드 메시지
		// 정수 입력 : 5
		// 1 2 3 4 5
		num = sc.nextInt(); 						// 정수 하나를 입력받기 위한 명령어, 입력받은 후 input에 저장
		// 1 미만의 숫자가 입력되는지 체크
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (i = 1; i <= num; i++) { 			// 조건식의 최댓값만큼 i가 출력이 되므로 최대값을 입력한 값으로 변경
				System.out.print(i+" ");
			}
		}
	}
}
