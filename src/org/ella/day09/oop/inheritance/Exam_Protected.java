package org.ella.day09.oop.inheritance;

import org.ella.day09.oop.inheritance.point.Point;

class Super {
	public int pub;
	int def;
	protected int pro;
	private int pri;
}

class Sub extends Super{
	void set() {
		Super sup = new Super();
		sup.pro = 507; 	// Sub클래스랑 Super클래스는 같은 패키지
						// 같은 패키지 내에서 상속받았기 때문에 pro도 가능
		super.pub = 31;
		super.def = 7;
		super.pro = 37;
//		super.pri = 2013; // is not visible
		
	}
}

class ShapePoint extends Point{
	void set() {
		Point p = new Point();
		p.pub = 31; // public이니까 다른 패키지도 접근 가능
//		p.def = 7;  // default는 같은 패키지에서만 가능
//		p.pro = 37; // protected는 같은 패키지 또는 상속일 때 가능
//		p.pri = 2013; // 당연히 안됨 private
		
		super.pub = 2;
//		super.def = 5;
		super.pro = 55; // ShapePoint클래스랑 Point클래스는 다른 패키지
						// 다른 패키지일 때 상속 받았으면 super로 써야함!
						// super 부모의 것을 가져다 쓰겠다!
//		super.pri = 25;
	}
}


public class Exam_Protected {
	
}
