package org.ella.self_practice;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// **
		// *
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		for (int i=0; i<num; i++) {
			for (int j=0; j<count; j++) {
				System.out.print("*");
				count++;
			}
			System.out.println("");
		}
	}
}
