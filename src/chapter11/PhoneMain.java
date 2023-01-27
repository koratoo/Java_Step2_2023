package chapter11;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone phone = new Phone(); -> 추상이라 안만들어짐
		
		SmartPhone smartPhone = new SmartPhone("김유신");
		
		System.out.println(smartPhone.owner + "님");
		smartPhone.turnOn();
		smartPhone.turnOff();
	}
	
	
	
	
}
