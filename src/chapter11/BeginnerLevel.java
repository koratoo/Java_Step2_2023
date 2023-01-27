package chapter11;

public class BeginnerLevel extends PlayLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump는 불가능합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn도 불가능 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=========초보자 입니다.=======");
		
	}

	
}
