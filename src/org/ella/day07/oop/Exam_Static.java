package org.ella.day07.oop;

class StaticSample { // 뒤에 소괄호가 있으면 메소드, 중괄호는 나머지
	public int num;
	public static int input;
	
	public void sampleMethod() {}
	
	public void goodMethod() {}
	
	public static void originMethod () {
		input = 2024;
	}
}

public class Exam_Static {

	public static void main(String[] args) {
		StaticSample smp = new StaticSample();
		StaticSample.input = 1023; // input값을 넣어도 static에 의해 변화없음
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
//		smp.num = 507;
//		smp.sampleMethod();
//		smp.goodMethod();

	}

}
