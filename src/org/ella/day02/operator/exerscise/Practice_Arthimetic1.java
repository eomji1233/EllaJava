package org.ella.day02.operator.exerscise;

public class Practice_Arthimetic1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = (++a) + b; 
		int d = c / a; 
		int e = c % a; 
		int f = e++; 
		int g = (--b) + (d--);
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
			//    6 + 9 /  (15 / 4)  *  (11 - 1)  %   (6 + 2) = 6+9/3*10 % 8 = 6+3*10 % 8 = 6+30 % 8 = 6+6
		//a=7, b=9, c=15, d=1, e=6, f=4, g=10, h=2, i=2
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
		
		
	}
}
