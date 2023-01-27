package chapter10;

public class Taxi extends Vehicle{

	private int taxiNum = 3000;

	@Override
	public void run() {
		System.out.println(taxiNum + "번 택시가 대기중입니다.");
	}
	
	
}
