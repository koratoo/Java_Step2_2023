package chapter09;

public class ChildMain {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		/* ��°��
		  Parent�� method1
		  Child�� method2
		  Child�� ���� �ִ� method3
		 */
		
		System.out.println("--------------");
		Parent p = new Parent();
		p.method1();
		p.method2();
		/* ��°��
		  Parent�� method1
		  Parent�� method2
		 */
		
		System.out.println("--------------");
		//Parent p2 = new Child();
		Parent p2 = child;
		p2.method1();
		p2.method2();
		/* ��°��
		 Parent�� method1
		 Child�� method2
		 */
	} 
	
}
