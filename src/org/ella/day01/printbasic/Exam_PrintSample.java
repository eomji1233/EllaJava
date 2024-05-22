package org.ella.day01.printbasic;

import java.util.Scanner;

public class Exam_PrintSample {
	public static void main(String [] args) {
		// print 명령어는 ln이 없고 개행이 안되므로 개행하고 싶으면 역슬래시 n 입력해야함. 
		System.out.print("지금까지와는 다른 출력 명령어"); 
		System.out.println(""); // 개행의 역할, 역슬래시 n 쓴 것 처럼 됨 		
		System.out.println("지금까지 쓰던 출력 명령어");
		
		Scanner detail = new Scanner(System.in);
		System.out.print("하나의 수 입력 : ");
		int num = detail.nextInt();
		
		// printf() 매소드
		System.out.printf("정수 출력 : %d", 57);  // 정수면 %d 뒤에 값 출력
	}
}
