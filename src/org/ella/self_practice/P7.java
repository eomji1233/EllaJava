package org.ella.self_practice;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		String words = sc.next();
		int count = 0;
		
		char [] alpha = new char[words.length()];
		
		for(int i = 0; i < words.length(); i++) {
			alpha[i] = words.charAt(i);
		}

		System.out.print("검색할 문자 : ");
		char input = sc.next().charAt(0);
		System.out.print(words+"에 "+input+"이 존재하는 인덱스는 : ");
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i] == input) {
				System.out.print((i+1)+" ");
				count++;
				}
			}
			System.out.println();
			System.out.print(input + "개수 : " + count);
	}
}

