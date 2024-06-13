package org.ella.day16.exam.practice;

public class UserInfo {
	public static void main(String[] args) {
		User [] userArr = new User[3];
		userArr[0] = new User("홍길동", 30, "서울시 마포구");
		userArr[1] = new User("김성훈", 27, "경기도 과천시");
		userArr[2] = new User("김사일", 29, "인천시 연수구");
		for(int i = 0; i < userArr.length; i++) {
			System.out.println("===============");
			System.out.println(userArr[i].toString());
			System.out.println("===============");
		}
	}
}