package chapter17.treeset;

public class MemberTreeSetMain  {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member3 memberPark = new Member3(1003,"������");
		Member3 memberLee = new Member3(1001,"������");
		Member3 memberSon = new Member3(1002,"�չα�");
	
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberSon);
		
		memberTreeSet.showAllMember();
	}
}
