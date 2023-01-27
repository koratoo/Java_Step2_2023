package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;

import chapter17.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>();
	}
	
	//저장 : arrayList에 add하는 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	
	//삭제 : arrayList에 remove하는 메서드
	public boolean removeMember(int memberId) {
		Iterator<Member> it = arrayList.iterator();
		
		//Next버튼이 활성화 되었는가?
		while(it.hasNext()) {
			Member member = it.next();//얘를 지우는게 목적
			int tempId=member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}//if
		}//while
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	//정보출력 메소드 : arrayList출력하기
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
	
}
