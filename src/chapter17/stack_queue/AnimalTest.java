package chapter17.stack_queue;

import java.util.ArrayList;

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

	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	//addAnimal -> �� ĳ����
	public void addAnimal() {
		aniList.add(new Eagle());
		aniList.add(new Tiger());
		aniList.add(new Human());
		for(Animal a : aniList) {
			a.move();
		}
		
	}
	
	//testCasting ->�ٿ� ĳ����
	public void testCasting() {

		for(int i=0;i<aniList.size();i++) {
			Animal a = aniList.get(i);
			if(a instanceof Eagle) {
				Eagle e = (Eagle) a;
				e.flying();
			}else if(a instanceof Tiger) {
				Tiger t = (Tiger) a;
				t.hunting();
			}else if(a instanceof Human) {
				Human h = (Human) a;
				h.readBook();
			}else {
				System.out.println("�������� �ʴ� Ÿ��");
			}
		}

	}
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		System.out.println("----��ĳ����----");
		aTest.addAnimal();
		System.out.println("----�׽�Ʈĳ����----");
		aTest.testCasting();
	}
}
