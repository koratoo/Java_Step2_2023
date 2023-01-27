package chapter11;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 전환합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
		
	}

	
}
