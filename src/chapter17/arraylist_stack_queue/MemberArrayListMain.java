package chapter17.arraylist_stack_queue;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		//팀원들의 정보
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박시훤");
		Member memberHong = new Member(1004,"홍길동");
		
		//회원가입 완료
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
		
		
	}
}
