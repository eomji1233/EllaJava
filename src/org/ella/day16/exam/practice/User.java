package org.ella.day16.exam.practice;

public class User {
	private String userName;
	private int userAge;
	private String userAddr;
	public User() {}
	public User(String userName, int userAge, String userAddr) {
		this.userName = userName;
		this.userAge = userAge;
		this.userAddr = userAddr;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userAge=" + userAge + ", userAddr=" + userAddr + "]";
	}
	
}
