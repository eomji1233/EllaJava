package org.ella.day05.exception.exercise;

import java.util.Scanner;

public class Exercise_Execption5 {

	public static void main(String[] args) {
		// 문제 5
		// NullPointerException
		try {
			String word = null;
			if(word.equals("키위")) {
				System.out.println("맞습니다.");
			} else {
				System.out.println("다릅니다.");			
			}
		} catch (Exception e) {
			System.out.println("Null값을 참조하였습니다.");
			// .앞이 null인데 명령어를 작성함.
		}
	}
}
