package chapter13;

import javax.swing.JOptionPane;

public class NonStatic {

	public static void main(String[] args) {
		//1.�ٱ� Ŭ���� ��ü
		Out obj1 = new Out();
		//2.���� Ŭ���� ��ü
		Out.In obj2=obj1.new In();
		//3.���ο� �ִ� �޼ҵ�
		String str = obj2.Infun();
		
		JOptionPane.showMessageDialog(null, str+"\n Success");
	}
	
	
}

class Out{
	static int a =1;
	

	public class In{
		
		public String Infun() {
			return (a + "��° Non-Static ���� �ǽ�");
		}
	}//In
}//outer class