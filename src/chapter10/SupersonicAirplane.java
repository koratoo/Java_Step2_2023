package chapter10;

public class SupersonicAirplane extends Airplane{

	//Normal = 1 /  Supersonic = 2
	//필드(전역변수)
	//싱글톤 static 
	//변경불가 final
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	public int flyMode=NORMAL;
	public int sonicMode=SUPERSONIC;//초 음속 비행
	
	//오버라이딩을 이용하여 flyMode가 Supersonic이면 초음속 비행입니다.
	//그렇지 않다면 일반 비행입니다.
	
	
	@Override
	public  void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 모드 입니다.");
		}else {
		super.fly();
		}//if
	}//fly
	

	
	
	
}
