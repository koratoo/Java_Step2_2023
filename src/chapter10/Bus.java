package chapter10;

public class Bus extends Vehicle{

	private int busNum = 1004;

	@Override
	public void run() {
	
		System.out.println(busNum+"번 버스가 달립니다.");
	}
	
	
}
