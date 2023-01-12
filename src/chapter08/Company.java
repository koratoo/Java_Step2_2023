package chapter08;

//Singleton
public class Company {

	//��ü�� �� �ϳ��� �����ϴ� Ŭ����
	private static Company instance = new Company();
	
	//�Ϲ����� ��ü ����
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	//singleton ��ü ���� �޼ҵ�
	public static Company getInstance() {
		
		//����ó��
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
	
}
