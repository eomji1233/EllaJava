package org.ella.day05.array;

import java.util.Scanner;

public class Practice_Array10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		char[] idNums = new char[idNum.length()];
		for (int i = 0; i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i); // 하나씩 잘라서 넣는거!!!!!!!!!!!
		}
		char[] copy = new char[idNum.length()];
		for (int i = 0; i < idNums.length; i++) {
			// copy[i] = idNums[i];
			if (i < 8) {
				copy[i] = idNums[i];
			} else {
				copy[i] = '*';
			}
		}
		for(char i : copy) { // for-each문 쓸 때 배열의 데이터타입 쓰고 변수 자체설정!
			System.out.print(i);
		}
	}
}
