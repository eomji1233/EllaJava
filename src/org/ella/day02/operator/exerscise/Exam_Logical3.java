package org.ella.day02.operator.exerscise;

import java.util.Scanner;

public class Exam_Logical3 {

	public static void main(String[] args) {
		// char a = 'A'+1; // 문자는 홑따옴표
		// String str = ""; // 문자열은 쌍따옴표
		// a = 'a'+1;
		// 몇 부터 몇 사이의 숫자인가? 65 ~ 90
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		char ch = scanner.next().charAt(0);
		boolean result;
		result = (ch >= 65) && (ch <= 90);
		System.out.println(result);
		scanner.close();
		
	}
}
