package org.ella.day09.oop.encapusulation;

public class Book {
	
	public static void main(String[] args) {
		// 필드에 직접 접근 (옳지 않은 방법)
//		Book book = new Book(); // 객체 생성
//		book.title = "춘향전"; // 다른 클래스로 갔을 때 is not visible
//		book.author = "작자미상";
		
		// 필드에 직접 접근하지 않고 객체를 초기화하는 방법
		// 생성자를 통해서 초기화
		Book book = new Book ("춘향전", "작자미상"); // 매개변수
		
		// setter() 메소드를 이용한 초기화
		Book bookbook = new Book();
		bookbook.setTitle("춘향전");
		bookbook.setAuthor("작자미상");
	}
	
	private String title;
	private String author;
	
	public Book() {
		this("", "");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// setter(), getter() 메소드 사용 이유?
	// 필드에 직접 접근 못하게 하고 우회해서 접근하게 하려고 사용
	// 1. set을 쓰고 필드명을 낙타표기법으로 써줌
	// ex) 필드가 name이면 setter()메소드는 setName()
	// 2. get을 쓰고 필드명을 낙타표기법으로 써줌
	// ex) 필드가 age면 getter()메소드는 getAge()
	
	// setter() 메소드
	public void setTitle(String title) {
		this.title = title; // 여기엔 this 필수
	}
	
	public void setAuthor(String author) {
		this.author = author;
	} 
	
	// getter() 메소드 - setter()메소드에서 저장한 값을 불러오는 메소드라 매개변수가 필요없음
	public String getTitle() {
		return this.title; // 여기엔 this 안붙여도 됨
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	// 멤버필드
//	String bookTitle;
//	int bookPrice;
//	String bookauthor;
//	String category;
//	String publisher;
//	String publishingDate;
	
	// 멤버메소드
//	public void sold() {}
//	public void rent() {}
//	public void add() {}
}
