package org.ella.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 커피 메뉴를 입력받고 가격을 알려주는 프로그램
		// 주문하시겠어요? 가격을 알려드립니다.
		// (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		// 메뉴를 입력해주세요 : 에스프레소
		// 2500원 입니다.
		// 메뉴를 입력해주세요 : 자바칩프라푸치노
		// 없는 메뉴입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주문하시겠어요? 가격을 알려드립니다. ");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		System.out.print("메뉴를 입력해주세요 : ");
		String menu = sc.next();
		int price = 0;
		if (menu.equals("에스프레소")) { // 문자열 비교는 ==이 안됨, 문자열 비교는 equals
			price = 4000;
			// System.out.println("4000원입니다.");
		}else if (menu.equals("카푸치노")) {
			price = 5000;
			// System.out.println("5000원입니다.");
		}else if (menu.equals("카페라떼")) {
			price = 5000;
			// System.out.println("5000원입니다.");
		}else if (menu.equals("아메리카노")) {
			price = 4500;
			// System.out.println("4500원입니다.");
		}else {
			// System.out.println("없는 메뉴입니다."); 
		}
		System.out.println(price+"원 입니다.");
		
	}

}
