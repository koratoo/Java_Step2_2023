package chapter12.Interface;

//��� �޾Ƽ� add����
public abstract class CompleteCalc1 implements Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}


	
}
