package chapter12.Interface;

//times/devide����
public class CompleteCalc2 extends CompleteCalc1 {

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int div(int num1, int num2) {
		try {
			return num1/num2;
		} catch (Exception e) {
			System.out.println("num2�� 0�� �Ұ����մϴ�.");
			return Calc.ERROR;
		}
	
	}
	public void showInfo() {
		System.out.println("Calc�������̽��� �����߽��ϴ�.");
	}

	@Override
	public void description() {
		System.out.println("�Ϻ��� ���� �Դϴ�.");
		//super.description();
	}
	
	

}
