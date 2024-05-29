package org.ella.day09.oop.encapusulation;

public class Circle {
	// 멤버변수
	private double radius;
	private String name;
	
	// setter() 메소드
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// getter() 메소드
	public double getRadius() { // return은 void랑 못씀! return의 자료형을 적어줘야함!
		return this.radius;
	}
	public String getName() {
		return this.name;
	}

	// 멤버메소드
	public double getArea() {
		// return을 쓰면 public 옆에
		// 리턴값과 같은 데이터타입을 써야함.
		return 3.14 * this.radius * this.radius;
	}
}
