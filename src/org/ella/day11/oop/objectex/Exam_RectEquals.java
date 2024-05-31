package org.ella.day11.oop.objectex;

class  Rectangle {
	int width, height;
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		Rectangle rect = (Rectangle)obj; // 다운캐스팅
		if(width == rect.width && height == rect.height) {
			return true;
		}else {
			return false;
		}
//		return super.equals(obj);
	}
}

public class Exam_RectEquals {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5, 7);
		Rectangle rect2 = new Rectangle(5, 7);
//		if(rect1 == rect2) {} // 주소는 다를테니 이렇게 비교안됨!
		if(rect1.equals(rect2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}

}
