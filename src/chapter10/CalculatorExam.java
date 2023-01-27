package chapter10;

public class CalculatorExam {

	public static void main(String[] args) {
		CalPlus plus = new CalPlus();
		CalMinus minus = new CalMinus();
		
		System.out.println("n1 + n2 : "+ plus.getResult(2,2));
		System.out.println("n1 - n2 : "+ minus.getResult(3,4));
	}
}
