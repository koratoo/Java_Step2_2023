package chapter19;

public class TestMyNumber {

	public static void main(String[] args) {
		
		/*
		//�ν��Ͻ� �����濡 �����θ� �����Ѵ�.
		MyNumber max=(x,y) -> (x>=y)?x:y;
		//�����θ� �����Ͽ� �����Ѵ�.
		System.out.println(max.getMax(10, 20));
		*/
		
		
		//���ٸ� �Ⱦ� ���
		//�߻�޼ҵ�� ��ü�� ���� �� ����.
		//�������̵带 �ؾ� ��ü�� ����� ��
		MyNumber aa = new MyNumber() {
			
			@Override
			public int getMax(int x, int y) {

				int max=(x>=y)?x:y;
				return max;
			}
		};
	
		//==================================
		System.out.println(aa.getMax(10, 20));
	
	}
}
