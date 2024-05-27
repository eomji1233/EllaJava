package org.ella.day07.oop.run;

import java.util.Scanner;

import org.ella.day07.oop.Book;
import org.ella.day07.oop.Circle;
import org.ella.day07.oop.Member;
import org.ella.day07.oop.exercise.Rectangle;

// 실행용 클래스
public class Run {

	public static void main(String[] args) {
//		Run ex = new Run();
//		ex.oopPractice1();
		Run.oopPractice1();
		oopExercise();
		Math.random(); // static이 붙여진 메소드는 ex를 붙여서 호출안하고 바로 씀
	}

	// 예제 2
//		Book book = new Book(); // 기본 생성자 이용해서 객체 생성
	// title, author는 모두 비어있음
//		book.title = "춘향전";
//		book.author = "작자 미상";
//		Book book = new Book("춘향젼", "작자미상");
//		Book emptyBook = new Book();

	public void constructorEx() {
		// 예제 3
		Circle bintz = new Circle();
		bintz.setRadius(10);
		System.out.println(bintz.getArea());
	}

	public static void oopPractice1() {
		// 너비와 높이를 입력받아
		// 사각형의 넓이를 출력하는 클래스를 만드시오.
		// >> 4 5
		// 사각형의 넓이는 20입니다.
		Rectangle rec = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		rec.width = sc.nextInt();
		rec.height = sc.nextInt();
		System.out.println("사각형의 넓이는 " + rec.getArea() + "입니다.");
	}

	public static void oopExercise() {
		// 예제 1
		// Circle의 instance를 이용하여
		// 이름이 달덩이, 반지름은 5인
		// Circle의 넓이를 출력해보세용용
		Circle circle1 = new Circle(); // 앞에 클래스는 한번만 호출
		circle1.name = "달덩이"; // 내가 만든 클래스를 계속 호출함
		circle1.radius = 5;
		double area = circle1.getArea();
		System.out.println(area); // 매소드 옆에는 괄호적기

		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "던킨도넛";
		area = donut.getArea();
		System.out.println(area);
	}

	public static void memberPractice() {
		Scanner sc = new Scanner(System.in);
		Member member1 = new Member();
		member1.name = "일용자";
		member1.age = 43;
		member1.job = "의사";
		Member member2 = new Member();
		member2.name = "이용자";
		member2.age = 22;
		member2.job = "백수";
		System.out.println(member1.name);
		System.out.println(member1.job);
		System.out.println(member1.age);
		System.out.println(member2.name);
		System.out.println(member2.job);
		System.out.println(member2.age);
	}
}
