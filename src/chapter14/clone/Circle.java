package chapter14.clone;

public class Circle implements Cloneable {

	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		//�����ڸ� ���ؼ� �ٸ� Ŭ������ ��ü ����
		point = new Point(x, y);
		this.radius = radius;
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������ " +point+"�̰�, "+"�������� "+radius+"�Դϴ�.";
	}
	
	
	
}
