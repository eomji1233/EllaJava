package org.ella.day04.array.practice;

import java.util.Scanner;

public class Practice_Array6 {

	public static void main(String[] args) {
		// 요일 문자배열을 만들어서
		// 0을 입력하면 월요일, 4를 입력하면 금요일이 출력되도록 하고
		// 0 ~ 6 이 외에 숫자를 입력하면 잘못 입력하셨습니다를 출력하세요.
		Scanner sc = new Scanner(System.in);
		String [] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if (num < 0 || num > 6) {
			System.out.print("잘못 입력하셨습니다롱");
		} else {
			System.out.print(day[num]);
		}
		
	}
}
