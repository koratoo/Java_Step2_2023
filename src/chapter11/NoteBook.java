package chapter11;

//하나라도 구현이 안됐으면 abstract -> abstract클래스로 써야한다.
//                  abstract -> 일반 클래스시 무조건 전부 오버라이드
public abstract class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("NoteBook Display()");
		
	}

	
}
