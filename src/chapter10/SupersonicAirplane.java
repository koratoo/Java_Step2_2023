package chapter10;

public class SupersonicAirplane extends Airplane{

	//Normal = 1 /  Supersonic = 2
	//�ʵ�(��������)
	//�̱��� static 
	//����Ұ� final
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	public int flyMode=NORMAL;
	public int sonicMode=SUPERSONIC;//�� ���� ����
	
	//�������̵��� �̿��Ͽ� flyMode�� Supersonic�̸� ������ �����Դϴ�.
	//�׷��� �ʴٸ� �Ϲ� �����Դϴ�.
	
	
	@Override
	public  void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ ��� �Դϴ�.");
		}else {
		super.fly();
		}//if
	}//fly
	

	
	
	
}
