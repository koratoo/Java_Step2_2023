package chapter11;

public abstract class Computer {

	//�߻� �޼ҵ� : Body�� ����. -> Html�� Body�� �ٸ�
	public abstract void display();
	public abstract void typing();
	
	//�Ϲ� �޼ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
