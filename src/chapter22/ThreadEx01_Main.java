package chapter22;

public class ThreadEx01_Main {

	public static void main(String[] args) {
		ThreadEx01 t = new ThreadEx01();
		t.start();
		//t.run()�� ������ �Ϲ������� ������ �Ʒ��� ���ʿ��� ���������� ������
		//�Ǵ� ������ ��ġ�� �ʴ´�.
		//t.run()�� �Ϲ� �޼ҵ� ȣ��� ���ֵǹǷ� �������� �������� ���� ���Ѵ�.
		//Thread�� start�� ȣ���Ѵ�.
		
		System.out.println("main ����");
	}
}
