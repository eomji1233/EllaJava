package org.ella.day01.inputsc;

import java.util.Scanner;

public class Exam_Scanner1 {

	public static void main(String [] args) {									
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner detail = new Scanner(System.in);
		String name = detail.next();
		String city = detail.next();
		int age = detail.nextInt();
		double weight = detail.nextDouble();
		boolean solo = detail.nextBoolean();
		System.out.println("이름은 " + name + ", 도시는 " + city + ", 나이는 " + age + "살, 체중은 " + weight + "kg, 독신 여부는 "+ solo +"입니다.");
		
		detail.close();
		
		}
}
