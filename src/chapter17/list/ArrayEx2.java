package chapter17.list;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�̱浿");
		list.add("��浿");
		list.add("��浿");
		list.add("���浿");
		System.out.println(list);
		
		System.out.println("list[0] : "+ list.get(0));
		System.out.println("list[2] : "+ list.get(2));
	}
}
