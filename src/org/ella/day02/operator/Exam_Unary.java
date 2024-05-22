package org.ella.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단항 연산자
		// a++, ++a -> a = a + 1;
		int a1 = 1;
		System.out.println(++a1); // 전위 연산자는 연산하고 출력
		System.out.println(a1++); // 후위 연산자는 출력한 다음부터 연산한 값 출력
		System.out.println(a1);
		// 문제 1
		// a가 10, b는 20, c는 30일 때,
		// a++; a=11
		// b = (--a) + b; a=10, b=30
		// c = (a++) + (--b); a=10 b=29
		// a, b, c의 값은?
		// a = 11, b = 29, c = 39
		int a = 10;
		int b = 20;
		int c = 30;
		a++;
		b = (--a)+b;
		c = (a++)+(--b);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		boolean flag = true;
		System.out.println(!!!!flag);
		
		// x는 100, y는 33, z는 0일 때,
		int x = 100;
		int y = 33;
		int z = 0;
		x--; // x=100
		z = (x--)+(--y); // x=99 y=32 z=131
		x = 99+(x++)+x; // x=99+98+99
		y = (y--)+y+(++y); // y=32+31+32
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);
		
	}

}
