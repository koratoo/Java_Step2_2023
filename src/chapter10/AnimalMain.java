package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		Spider spider = new Spider();
		Bear bear = new Bear();
		Lion lion = new Lion();

		System.out.println("------------��--------------");
		System.out.println("���� �ٸ��� " + bear.getLeg() + "�� �Դϴ�.");
		System.out.println("���� ���� " + bear.getEye() + "�� �Դϴ�.");
		bear.Gom();
		

		System.out.println("------------����--------------");
		System.out.println("������ �ٸ��� " + lion.getLeg() + "�� �Դϴ�.");
		System.out.println("������ ���� " + lion.getEye() + "�� �Դϴ�.");
		lion.Galgi();
		
		
		System.out.println("------------�Ź�--------------");
		System.out.println("�Ź��� �ٸ��� " + spider.getLeg() + "�� �Դϴ�.");
		System.out.println("�Ź��� ���� " + spider.getEye() + "�� �Դϴ�.");
		System.out.println("�Ź��� Ư¡�� " +spider.web +"�ϴ� �Ź����Դϴ�.");
		
	
	}
}
