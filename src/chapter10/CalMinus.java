package chapter10;

public class CalMinus extends Calculator {
		//CalMinus클래스를 만들어 Calculator클래스를 상속받으세요.
		//오버라이딩을 이용하여 Calculator의 getResult()함수를
		//인자로 받은 n1과 n2를 빼주는 함수로 만듭니다.
		@Override
		public int getResult(int n1, int n2) {
			
			return n1-n2;
		}
}
