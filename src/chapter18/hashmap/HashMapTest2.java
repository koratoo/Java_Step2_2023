package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		//Map map
		Map<String, Integer> map = new HashMap<String,Integer>();
	
		//팀원 데이터 (성함, 학번)저장
		map.put("김병효", 1001);
		map.put("김형우", 1002);
		map.put("김주은", 1003);
		map.put("김지성", 1004);
		map.put("윤민주", 1005);
		map.put("이채윤", 1006);
		
		//팀원 인원
		System.out.println("팀원의 수 : " + map.size() +"명");
		
		//팀장의 학번 알아내자
		System.out.println("팀장의 학번 : "+ map.get("김병효") +"번");
		System.out.println("--------------------");
		
		//팀원 모두의 학번 출력
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		System.out.println("팀원 모두의 학번 출력");
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key +" : " +value +" 번");
		}
		System.out.println();
	}
}
