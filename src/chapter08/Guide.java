package chapter08;

public class Guide {
	
	static String point;
	Guest[] guest;
	
	//������ �ʱ�ȭ
	public Guide(int n) {
		point = "�߸�";
		guest = new Guest[n];
	
	//��ü ����
	for(int i=0; i<guest.length; i++) {
		guest[i] = new Guest();
		}
	
		
	}

}
