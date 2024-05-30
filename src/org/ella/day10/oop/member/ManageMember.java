package org.ella.day10.oop.member;

public class ManageMember {
	
//	private Member member;
	private Member [] members;
	private int index;
	
	public ManageMember() {
		members = new Member[5]; // 배열에다 전달받은 member 객체 저장
		index = 0;
	}

	public void registerMember(Member member) {
//		this.member = member;
		if (index < members.length) {
			members[index] = member; // 멤버스 배열에 입력받은 멤버를 넣을거야
			index++;  // 순서대로 차곡차곡 저장하기 위해서는 index변수 사용
		}
	}

	public Member [] allMember() {
//		return member;
		return members;
	}

	public Member searchOneById(String memberId) {
		for(Member member : members) {
			if(member != null && 
					memberId.equals(member.getMemberId())) {
				return member;
			}
		}
		return null;
	}

}
