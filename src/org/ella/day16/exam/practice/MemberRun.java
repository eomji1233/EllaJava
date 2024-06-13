package org.ella.day16.exam.practice;

public class MemberRun {
	public static void main(String[] args) {
		Member m = new Member();
		m.setName("홍길동");
		m.setAge(25);
		m.setAddress("서울시 영등포구");
		m.setAddress("독서");
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("주소 : " + m.getAddress());
		System.out.println("취미 : " + m.getHobby());
	}
	
}
