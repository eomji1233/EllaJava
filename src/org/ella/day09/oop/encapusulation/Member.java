package org.ella.day09.oop.encapusulation;

import java.util.Scanner;

public class Member {
	// 멤버변수(필드)
	private String name; // public 이라고 적어줘야 다른 클래스에서 사용 가능
	private char gender;
	private int age;
	private String education;
	private long salary;
	private String job;
	private String property; 		// 집 1채, 자동차 2대 / 500,000,000
	private String phone; 			// 01012345678
	private String address;
	private boolean divorceYN; 		// Yes or No / 기본형
	private String children;		// 1남 1여
	
	// 생성자
	public Member() {} 
	
	// 멤버메소드(메소드)
//	public void registerMember() {}
	public void doHeart() {}
	public void sendMessage() {}
	public void doPromise() {}
}
