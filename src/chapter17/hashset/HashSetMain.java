package chapter17.hashset;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add(new String("������"));
		hs.add(new String("������"));
		hs.add(new String("ȫ����"));
		hs.add(new String("������"));
		
		System.out.println(hs);
		
		hs.add(new String("������"));
	}
}
