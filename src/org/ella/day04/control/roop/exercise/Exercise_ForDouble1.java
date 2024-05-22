package org.ella.day04.control.roop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ******

		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int count = 1;
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}
			System.out.println();
			count++;
		}
	}
}
