package chapter11;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone phone = new Phone(); -> �߻��̶� �ȸ������
		
		SmartPhone smartPhone = new SmartPhone("������");
		
		System.out.println(smartPhone.owner + "��");
		smartPhone.turnOn();
		smartPhone.turnOff();
	}
	
	
	
	
}
