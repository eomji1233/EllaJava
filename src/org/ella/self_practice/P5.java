package org.ella.self_practice;

public class P5 {
	public static void main(String[] args) {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum+=i;
		if (i<10) {
			System.out.print(i + "+");
		}
		if (i==10) {
			System.out.print(i + "=" );
		}
		}
		System.out.println(sum);
	}
}
