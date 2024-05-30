package org.ella.day10.oop.abstractex.exercise;


public class CalcRun extends GoodCalc {
	public static void main(String[] args) {		
		Calculator calc = new GoodCalc();  // 업캐스팅
//		GoodCalc goodCalc = new GoodCalc();
		System.out.println("합 : " + calc.add(5, 7)); // 5 7
		System.out.println("차 : " + calc.substract(10, 23)); // 10 23
		int [] nums = {5, 7, 10, 23};
		System.out.println("평균 : " + calc.average(nums)); // 5 7 10 23
//		 							 + calc.average(new int [] {5, 7, 10, 23})		
	}
}
