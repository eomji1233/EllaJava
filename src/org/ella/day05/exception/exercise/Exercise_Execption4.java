package org.ella.day05.exception.exercise;

import java.util.Scanner;

public class Exercise_Execption4 {

	public static void main(String[] args) {
		// 문제 4
		// 문자열을 정수로 변환할 떄
		// 발생하는 NumberFormatException을
		// 처리하는 프로그램을 작성하라.
		String [] words = {"507", "10.23", ""};
		// String -> int
		try {
			int result = Integer.parseInt(words[0]);
			System.out.print(result);
			int result2 = Integer.parseInt(words[1]);
			System.out.println(result2);
//			int result3 = Integer.parseInt(words[2]);
//			System.out.println(result3);			
		} catch (Exception e) {
			System.out.println("해당 문자열은 정수로 변환할 수 없습니다");
		}
	}
}
