package chapter13;

public class Localinner {

	int a= 100;
	
	//innerTest�Լ� ����
	public void innerTest(int n) {
		int b=200;//��������
		final int c = n;//���
		//----------------------------------------------------
		//innerTest()�Լ� ���ο� ����Ŭ���� �ۼ�
		class Inner{
			//���� ����Ŭ������ �ܺ� Ŭ������ ��������� ����� ������ �� �ִ�.
			public void getData() {
				System.out.println("int a : " + a);
				System.out.println("int b : " + b);//����
				System.out.println("int c : " + c);
			}
		}//local ���� Ŭ����
		//----------------------------------------------------
		//�Լ����ο� �ִ� Ŭ������� �ص� �Լ��� ȣ���ϸ� ����� �ڵ����� ������ ���� �ƴ϶�
		//��ü�� ���� ����ؾ��Ѵ�.
		Inner i = new Inner();
		i.getData();
	}//method
	
	public static void main(String[] args) {
		Localinner outer = new Localinner();
		outer.innerTest(500);	
	}
}
