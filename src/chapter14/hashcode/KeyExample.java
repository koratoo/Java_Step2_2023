package chapter14.hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		System.err.println(hashMap);
		
		hashMap.put(new Key(1), "ȫ�浿");
		System.err.println(hashMap);
		hashMap.put(new Key(1), "������");
		System.err.println(hashMap);
	}
}
