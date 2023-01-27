package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain{

	public static void main(String[] args) {
		//¼ø¼­ Ok, Áßº¹ Ok
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		
		Member memberLee = new Member(1001,"ÀÌÁö¿ø");
		Member memberSon = new Member(1002,"¼Õ¹Î±¹");
		Member memberPark = new Member(1003,"¹Ú½ÃÈÍ");
		Member memberHong = new Member(1004,"È«±æµ¿");
	
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberSon);
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberHong);
		
		memberLinkedList.showAllMember();
		
		Member memberKim = new Member(1003,"±è½Ã±¹");
		memberLinkedList.addMember(memberKim);
		
		memberLinkedList.showAllMember();
		
	}
}
