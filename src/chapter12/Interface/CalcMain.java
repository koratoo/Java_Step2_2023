package chapter12.Interface;

public class CalcMain {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 =5;
		
		Calc calc = new CompleteCalc2();
		
		System.out.println("--------����Ʈ�޼���--------");
		calc.description();
		System.out.println();
		
		System.out.println("--------����ƽ�޼���----------");
		int[] arr= {1,2,3,4,5};
		System.out.println("1 ~ 5 ������ �� : " + Calc.total(arr));
		
		System.out.println("-----�������̽� �޼��� ȣ��------");
		System.out.println("num1 + num2 : "+calc.add(num1, num2));
		System.out.println("num1 - num2 : "+calc.substract(num1, num2)); 
		System.out.println("num1 * num2 : "+calc.times(num1, num2)); 
		System.out.println("num1 / num2 : "+calc.div(num1, num2)); 
		
		
	}
}
