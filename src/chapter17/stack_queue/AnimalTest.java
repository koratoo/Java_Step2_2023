package chapter17.stack_queue;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이는 네발로 걷습니다.");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리는 날개를 펴고 납니다.");
	}
}


public class AnimalTest {

	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	//addAnimal -> 업 캐스팅
	public void addAnimal() {
		aniList.add(new Eagle());
		aniList.add(new Tiger());
		aniList.add(new Human());
		for(Animal a : aniList) {
			a.move();
		}
		
	}
	
	//testCasting ->다운 캐스팅
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
				System.out.println("지원되지 않는 타입");
			}
		}

	}
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		System.out.println("----업캐스팅----");
		aTest.addAnimal();
		System.out.println("----테스트캐스팅----");
		aTest.testCasting();
	}
}
