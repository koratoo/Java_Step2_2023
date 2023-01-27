package chapter14.hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		System.err.println(hashMap);
		
		hashMap.put(new Key(1), "È«±æµ¿");
		System.err.println(hashMap);
		hashMap.put(new Key(1), "±èÀ¯½Å");
		System.err.println(hashMap);
	}
}
