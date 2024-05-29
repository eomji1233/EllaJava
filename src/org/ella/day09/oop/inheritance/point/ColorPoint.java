package org.ella.day09.oop.inheritance.point;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super(); 	// this() 처럼 생성자 호출하는데 부모의 생성자를 호출함.
					// 상속받은 경우 부모의 생성자부터 호출함.
	}
	public ColorPoint(int x, int z, String color) {
		super(x,z);
//		this.x = x; // is not visible
//		this.y = y;
		this.color = color;
	}
	
	public void showColorPoint() {
		super.showPoint();
		System.out.println(this.color + "색의 점입니다.");
	}
}
