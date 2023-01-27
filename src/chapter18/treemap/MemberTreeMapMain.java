package chapter18.treemap;

import java.util.HashMap;
import java.util.HashSet;

import chapter17.Member;

public class MemberTreeMapMain {

	public static void main(String[] args) {
		MemberTreeMap memTreeMap = new MemberTreeMap();
	
		Member memberLee = new Member(1000,"������");
		Member memberKim = new Member(1001,"������");
		Member memberPark = new Member(1002,"������");
		Member memberAhn = new Member(1003,"������");
		//���濡 ���� Member ������
		memTreeMap.addMember(memberLee);
		memTreeMap.addMember(memberKim);
		memTreeMap.addMember(memberPark);
		memTreeMap.addMember(memberAhn);
		
		memTreeMap.showAllMember();
		
		memTreeMap.removeMember(1003);
		memTreeMap.showAllMember();
		
		
	}
}
