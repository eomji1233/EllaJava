package org.ella.day02.operator;

import java.util.Scanner;

public class Exam_Arthimetic {

	public static void main(String[] args) {
		// 산술 연산자
		// +, -, *, /, %
		// % : 나머지를 구해주는 연산자
		// 문제 1
		// 초 단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초 인지 출력하는 프로그램을 작성하여라.
		Scanner scanner = new Scanner(System.in);
		System.out.print("초 단위의 정수를 입력하세요 : ");
		int time = scanner.nextInt();
		int hour = time / 60 / 60;
		int minute = (time / 60) % 60;
		int second = time % 60; 
		System.out.println(hour + "시간 " + minute + "분 " + second + "초입니다.");
		// 5000 / 60		
		// 83 / 60 = 1h
		// 83 % 60 = 23m
		// 5000 % 60 = 20s
				
	}

}
