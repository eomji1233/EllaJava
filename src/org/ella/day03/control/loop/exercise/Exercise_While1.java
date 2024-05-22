package org.ella.day03.control.loop.exercise;

public class Exercise_While1 {

	public static void main(String[] args) {
		// While문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오
		// 1 ~ 100 사이의 홀수의 합 : ?
		int sum = 0;
		int i = 1;
		while (i < 101) {
			if (i % 2!=0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);

	}
}
