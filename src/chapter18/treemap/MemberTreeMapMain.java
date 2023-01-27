package chapter18.treemap;

import java.util.HashMap;
import java.util.HashSet;

import chapter17.Member;

public class MemberTreeMapMain {

	public static void main(String[] args) {
		MemberTreeMap memTreeMap = new MemberTreeMap();
	
		Member memberLee = new Member(1000,"ÀÌÁöÈÆ");
		Member memberKim = new Member(1001,"±èÁöÈÆ");
		Member memberPark = new Member(1002,"¹ÚÁöÈÆ");
		Member memberAhn = new Member(1003,"¾ÈÁöÈÆ");
		//°¡¹æ¿¡ ³ÖÀ» Member µ¥ÀÌÅÍ
		memTreeMap.addMember(memberLee);
		memTreeMap.addMember(memberKim);
		memTreeMap.addMember(memberPark);
		memTreeMap.addMember(memberAhn);
		
		memTreeMap.showAllMember();
		
		memTreeMap.removeMember(1003);
		memTreeMap.showAllMember();
		
		
	}
}
