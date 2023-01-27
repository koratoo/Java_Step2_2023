package chapter11;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메소드(재정의가 불가능함)
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
