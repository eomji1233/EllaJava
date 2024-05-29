package org.ella.day09.oop.inheritance.point;

public class Point {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	private int x,y;
	private int z;
	
	public Point() {}

	public Point(int x, int y) {
		this.x = x+1;
		this.y = y;
	}
	
//	public void Point1(int x, int z) {
//		this.x = x+3;
//		this.z = z;
//	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void showPoint() {
		System.out.printf("%d, %d\n", x, y);
	}
}
