package org.ella.day10.oop.abstractex.exercise;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// 배열에서 값을 꺼내서 누적합 후 배열의 크기로
		// 나누기
		int sum = 0;
		for (int num : a) {
			sum += num;
		}
		double avg = (double)sum / a.length;
		return avg;
	}
}
