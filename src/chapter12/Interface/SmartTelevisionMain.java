package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("---------------------------");
		
		//�������̽� ��ü ���� -> �ڱ�͸� ��
		Remote rc =tv;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
	}
}
