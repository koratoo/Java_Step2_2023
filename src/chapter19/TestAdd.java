package chapter19;

public class TestAdd {

	public static void main(String[] args) {
		//���ٽ� : �Ű����� ���� ������
		//Lamda : �޼ҵ� �̸� ���� �����θ� ������
		//-> : C����� ������
		//Add��� addFŬ������ x,y�Ű������� ���� ��´�.
		//�̸� ���� ���� ���� / ������ �Լ�
		Add addF=(x,y) -> x+y;
		
		System.out.println(addF.add(3, 5));
		
	}
}
