package org.ella.day08.oop.student.practice;

import java.util.Scanner;

public class ViewStudent {

	public void ViewStudent() {}

	public int printmenu() {
		Scanner sc = new Scanner(System.in);
//		int choice = sc.nextInt();
		System.out.println("===== 메뉴 입력 =====");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		return choice;
	}

	public void displayMsg(String message) {
		System.out.println(message);
		
	}
}
