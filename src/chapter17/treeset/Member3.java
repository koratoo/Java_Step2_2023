package chapter17.treeset;

import java.util.Comparator;

public class Member3 implements Comparator<Member3>{

	private int memberId;
	private String memberName;
	
	//Comparator를 쓰려면 기본생성자 필수
	public Member3() {
		
	}
	
	public Member3(int memberId, String memberName) {
		// TODO Auto-generated constructor stub
		this.memberId=memberId;
		this.memberName=memberName;
	}
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + "회원님의 아이디는 "+ memberId +"입니다.";
	}
/*
	@Override
	public int compareTo(Member3 member) {
		return (this.memberId-member.memberId)*-1;
	}
*/
	@Override
	public int compare(Member3 o1, Member3 o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	



}
