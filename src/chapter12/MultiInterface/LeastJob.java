package chapter12.MultiInterface;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("�����ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("���� �������� ���ų� ����Ⱑ ���� ���� �������� �����˴ϴ�.");
	}

}
