package org.ella.day09.oop.overriding;

public class Circle extends Shape {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		// super.draw(); // 부모의 것을 가져다 쓰겠다
		System.out.println("Circle");
	}
}
