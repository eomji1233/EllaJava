package org.ella.day07.oop;

import java.util.Scanner;

public class Member {
	// 멤버변수(필드)
	public String name; // public 이라고 적어줘야 다른 클래스에서 사용 가능
	char gender;
	public int age;
	String education;
	long salary;
	public String job;
	String property; 		// 집 1채, 자동차 2대 / 500,000,000
	String phone; 			// 01012345678
	String address;
	boolean divorceYN; 		// Yes or No / 기본형
	String children;		// 1남 1여
	
	// 생성자
	public Member() {} 
	
	// 멤버메소드(메소드)
//	public void registerMember() {}
	public void doHeart() {}
	public void sendMessage() {}
	public void doPromise() {}
}
