package chapter10;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		//����ƽ�� ��� Ŭ������. ���� ���°� ���� ex)SupersonicAirplane.SUPERSONIC;
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
