package chapter16.generic1;

public class GenExMain {


	public static void main(String[] args) {
		//����ڰ� ���ϴ� ���·� ��ü�� �������
		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		//����,�Ǽ�,���� ->�Ϲ� �ڷ����� ���� �� ���� ��ü�� ���;� ��
		//���׸� Ÿ���� ��ü�� �⺻�ڷ���
		GenEx<Integer> iType = new GenEx<Integer>();
		GenEx<Float> fType = new GenEx<Float>();
		GenEx<Character> cType = new GenEx<Character>();
		iType.setValue(100);
		fType.setValue((float) 11.01);
		cType.setValue('A');
		System.out.println(iType.getValue() +" " +fType.getValue() + " "+cType.getValue());
		
		
	}
}
