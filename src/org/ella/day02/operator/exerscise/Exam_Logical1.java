package org.ella.day02.operator.exerscise;

public class Exam_Logical1 {

	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		boolean result1, result2, result3, result4;
		result1 = ((a!=b) && (a<b));
		result2 = ((a<b) || (a==b));
		result3 = ((a>b) && (a!=b));
		result4 = ((a>b) || (a==b));
		System.out.println("결과값 : " + result1);
		System.out.println("결과값 : " + result2);
		System.out.println("결과값 : " + result3);
		System.out.println("결과값 : " + result4);
	}
}
