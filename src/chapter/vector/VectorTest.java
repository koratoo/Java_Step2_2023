package chapter.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Object obj;
		//ũ�� 1�� �迭 ����
		Vector<Object> vec = new Vector<Object>(1);
		obj=20221227;
		vec.addElement(obj);//������Ʈ �߰�
		System.out.println("�뷮�� #1 : "+vec.capacity());
		//vector ����Ǵ� ������Ʈ ��
		System.out.println("ũ��� #1 : "+vec.size());
		System.out.println();
		
		obj="some people";
		vec.addElement(obj);//������Ʈ �߰�
		System.out.println("�뷮�� #2 : "+vec.capacity());
		//vector ����Ǵ� ������Ʈ ��
		System.out.println("ũ��� #2 : "+vec.size());
		System.out.println();

		obj="dream of success";
		vec.addElement(obj);//������Ʈ �߰�
		System.out.println("�뷮�� #3 : "+vec.capacity());
		//vector ����Ǵ� ������Ʈ ��
		System.out.println("ũ��� #3 : "+vec.size());
		System.out.println();
		
		obj="dress";
		vec.addElement(obj);//������Ʈ �߰�
		System.out.println("�뷮�� #4 : "+vec.capacity());
		//vector ����Ǵ� ������Ʈ ��
		System.out.println("ũ��� #4 : "+vec.size());
		System.out.println();
		
		obj="success";
		vec.addElement(obj);//������Ʈ �߰�
		System.out.println("�뷮�� #5 : "+vec.capacity());
		//vector ����Ǵ� ������Ʈ ��
		System.out.println("ũ��� #5 : "+vec.size());
		System.out.println();
		
		obj="dream";
		vec.addElement(obj);//������Ʈ �߰�
		System.out.println("�뷮�� #6 : "+vec.capacity());
		//vector ����Ǵ� ������Ʈ ��
		System.out.println("ũ��� #6 : "+vec.size());
		
		System.out.println(vec);
	}
}
