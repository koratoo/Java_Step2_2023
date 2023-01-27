package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;

import chapter17.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>();
	}
	
	//���� : arrayList�� add�ϴ� �޼���
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	
	//���� : arrayList�� remove�ϴ� �޼���
	public boolean removeMember(int memberId) {
		Iterator<Member> it = arrayList.iterator();
		
		//Next��ư�� Ȱ��ȭ �Ǿ��°�?
		while(it.hasNext()) {
			Member member = it.next();//�긦 ����°� ����
			int tempId=member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}//if
		}//while
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	//������� �޼ҵ� : arrayList����ϱ�
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
	
}
