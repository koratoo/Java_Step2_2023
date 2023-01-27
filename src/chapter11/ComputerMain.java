package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		
		//추상클래스는 객체를 만들 수 없다.
		Computer c1 = new Computer() {

			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void typing() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
}
