package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("---------------------------");
		
		//인터페이스 객체 생성 -> 자기것만 됨
		Remote rc =tv;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
	}
}
