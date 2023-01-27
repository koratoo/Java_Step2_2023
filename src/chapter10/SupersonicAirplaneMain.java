package chapter10;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		//스태틱인 경우 클래스명. 으로 쓰는걸 권장 ex)SupersonicAirplane.SUPERSONIC;
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
