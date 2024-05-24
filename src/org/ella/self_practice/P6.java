package org.ella.self_practice;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// do While문을 이용하여 -1이 입력될 때 까지
		// 정수를 입력받고 -1이 입력되면 입력한 수의 합을 출력하시오.
		
		int sum=0, num=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("정수 입력하라 : ");
			num = sc.nextInt();
			sum += num;
			if (num==-1)
				break;
		} while (num != -1); {
			System.out.print(sum);
		}
	}
}
