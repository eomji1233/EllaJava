package org.ella.day02.printbasic;

public class Exam_PrintSample {

	public static void main(String[] args) {
		
		System.out.println("이것이 원래 쓰던거");
		System.out.print("이게 조금 다른거\n"); // 개행이 없어서 \n
		System.out.println();
		// 형식문자
		// 1. 정수 : %d
		// 2. 실수 : %f
		// 3. 문자 : %c
		// 4. 문자열 : %s
		System.out.printf("정수 출력 : %d\n", 1);
		System.out.printf("실수 출력 : %.3f\n", 0.4515);
		System.out.printf("문자 출력 : %c\n", '일');
		System.out.printf("문자열 출력 : %s\n", "일공이삼");
		System.out.printf("개강날짜 : %.1f, 종강날짜 : %.2f\n", 5.7, 10.23);
		
	}
}
