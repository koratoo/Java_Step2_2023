package chapter14.clone;

public class Circle implements Cloneable {

	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		//생성자를 통해서 다른 클래스의 객체 생성
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
		return "원점은 " +point+"이고, "+"반지름은 "+radius+"입니다.";
	}
	
	
	
}
