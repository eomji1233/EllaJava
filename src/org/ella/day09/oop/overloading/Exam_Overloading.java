package org.ella.day09.oop.overloading;

class Weapon {
	String name;
	int price;
	
	public Weapon() {}
	public Weapon(String name, int price) { // 매개변수를 넣어주면 다른 클래스값으로 인정됨 중복 사용가능
		this.name = name;
		this.price = price;
	}
}

public class Exam_Overloading {
	public static void main(String[] args) {
		/*
		 * 메소드 오버로딩 
		 * 이름은 똑같으나 매개변수의 개수나 타입이 달라야 적용됨
		 * 오버로딩이 적용되어 있는 사례
		 * ex) System.out.println("")
		 */
		System.out.println("고마워 오버로딩!!");
		System.out.println("1023");
		System.out.println('F');
		
	}
	public void makesomenoise() {
		
	}
	
	public void makesomenoise(int num) {
		
	}
}
