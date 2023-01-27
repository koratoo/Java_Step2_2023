package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		//Map map
		Map<String, Integer> map = new HashMap<String,Integer>();
	
		//���� ������ (����, �й�)����
		map.put("�躴ȿ", 1001);
		map.put("������", 1002);
		map.put("������", 1003);
		map.put("������", 1004);
		map.put("������", 1005);
		map.put("��ä��", 1006);
		
		//���� �ο�
		System.out.println("������ �� : " + map.size() +"��");
		
		//������ �й� �˾Ƴ���
		System.out.println("������ �й� : "+ map.get("�躴ȿ") +"��");
		System.out.println("--------------------");
		
		//���� ����� �й� ���
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		System.out.println("���� ����� �й� ���");
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key +" : " +value +" ��");
		}
		System.out.println();
	}
}
