package chapter17;

public class Member {

	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		// TODO Auto-generated constructor stub
		this.memberId=memberId;
		this.memberName=memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + "회원님의 아이디는 "+memberId+"입니다.";
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	

	
}
