package org.ella.day11.oop.objectex.exercise;

public class Point {
	int x, y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		Point po = (Point)obj;
		return x == po.x && y == po.y;
		
//		if(x == po.x && y == po.y) {
//			return true;
//		} else
//			return false;
	}
}
