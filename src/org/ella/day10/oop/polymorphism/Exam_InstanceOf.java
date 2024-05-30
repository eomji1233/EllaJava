package org.ella.day10.oop.polymorphism;

class Car {}
class Sonata extends Car{}
class Genesis extends Car{	}
class GV80 extends Genesis{} // Car가 아니라 제네시스 상속받았기 때문에 16~

public class Exam_InstanceOf {
	
	static void print(Car car) {
		if(car instanceof Sonata) { // 객체를 구별해줄 때 사용!
									// 오버라이딩이랑은 상관업서
			System.out.println("소나타 점프 방방!");
		}if(car instanceof Genesis) {
			System.out.println("제네시스 스웩 부릉~");
		}if(car instanceof GV80) {
			System.out.println("GV80 고고씽~"); // 제네시스랑 이거 둘다 출력!
		}
//		else {
//			System.out.println("부릉부릉");			
//		}
	}

	public static void main(String[] args) {
		print(new Car());
		print(new Sonata()); // 업캐스팅
		print(new Genesis());
		print(new GV80());
	}
}
