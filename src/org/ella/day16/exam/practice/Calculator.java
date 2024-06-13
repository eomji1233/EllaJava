package org.ella.day16.exam.practice;

import java.util.Scanner;

public abstract class Calculator {
	public int plus(int num1, int num2) {
		return num1 + num2;
	}
	public abstract int minus(int num1, int num2);
	
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}
	public double div(int num1, int num2) {
		return num1/(double)num2;
	}
}

