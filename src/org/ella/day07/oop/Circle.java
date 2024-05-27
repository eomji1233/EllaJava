package org.ella.day07.oop;

public class Circle {
	// 멤버변수
	public double radius;
	public String name;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// 멤버메소드
	public double getArea() {
		// return을 쓰면 public 옆에
		// 리턴값과 같은 데이터타입을 써야함.
		return 3.14 * this.radius * this.radius;
	}
}
