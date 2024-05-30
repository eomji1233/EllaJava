package org.ella.day10.oop.member;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	
	public Member() {}
	
	// setter
	public void setMemberId(String memberId) {  // 매개변수, 반환형 모르니까 
		this.memberId = memberId;				// 기본형으로 메소드 만들어놓기
	}											// 우클릭-소스-게터세터 자동생성
	
	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	// getter
	public String getMemberId() {
		return this.memberId;
	}
}
