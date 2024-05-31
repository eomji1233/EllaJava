package org.ella.day11.oop.member;

public class Member {
	private String memberName;
	private String memberEmail;
	private String mamberPhone;
	private String memberAddress;
	
	public Member() {}

	public Member(String memberName, String memberEmail, String mamberPhone, String memberAddress) {
		super();
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.mamberPhone = mamberPhone;
		this.memberAddress = memberAddress;
	}



	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
//		if(memberName.length() > 2)
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return mamberPhone;
	}

	public void setMemberPhone(String mamberPhone) {
		this.mamberPhone = mamberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	
	@Override
	public String toString() {
		return "Member [memberName=" + memberName + ", memberEmail=" + memberEmail + ", mamberPhone=" + mamberPhone
				+ ", memberAddress=" + memberAddress + "]";
	}
	
}
