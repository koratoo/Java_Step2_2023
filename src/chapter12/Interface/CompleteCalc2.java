package chapter12.Interface;

//times/devide구현
public class CompleteCalc2 extends CompleteCalc1 {

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int div(int num1, int num2) {
		try {
			return num1/num2;
		} catch (Exception e) {
			System.out.println("num2에 0은 불가능합니다.");
			return Calc.ERROR;
		}
	
	}
	public void showInfo() {
		System.out.println("Calc인터페이스를 구현했습니다.");
	}

	@Override
	public void description() {
		System.out.println("완벽한 계산기 입니다.");
		//super.description();
	}
	
	

}
