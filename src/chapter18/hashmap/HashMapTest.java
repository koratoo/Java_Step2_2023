package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("±èÄ¡", 85);
		map.put("È«±æµ¿", 90);
		map.put("¹Ú¼ö", 98);
		map.put("µ¿Àå±º", 75);
		System.out.println("ÃÑ ¿£Æ®¸® ¼ö : "+map.size());
		
		//°´Ã¼ Ã£±â
		System.out.println("\t È«±æµ¿ : "+map.get("È«±æµ¿")+" Á¡");
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t "+key +" : " +value +" Á¡");
		}
		System.out.println();
		
		map.remove("È«±æµ¿");
		System.out.println("ÃÑ ¿£Æ®¸® ¼ö : "+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
		}
		
		System.out.println();
		map.clear();
		System.out.println("ÃÑ Entry ¼ö : "+map.size());
	}
}
