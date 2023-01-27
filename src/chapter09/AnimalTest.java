package chapter09;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}
class Tiger extends Animal{
	
	public void move() {
		System.out.println("ȣ���̴� �׹߷� �Ƚ��ϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
}
class Eagle extends Animal{
	
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ ��� ���ϴ�.");
	}
}



public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		Animal h = new Human();
		Animal t = new Tiger();
		Animal e = new Eagle();
		
		aTest.moveAnimal(h);
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	public void doAnimal(Eagle eagle, Tiger tiger, Human human) {
		tiger.hunting();
		human.readBook();
		eagle.flying();
	}
}
