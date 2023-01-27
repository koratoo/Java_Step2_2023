package chapter21.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	String job;
	transient String number;
	
	public Person(String name, String job) {
		this.name =name;
		this.job = job;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+", "+job;
	}
	
	
}


public class SerializationTest {


	public static void main(String[] args) {
		Person personHong = new Person("ȫ�浿","��ǥ�̻�");
		Person personKim = new Person("�迬��","���̻�");
		/*
		 ObjectOutputStream : �����̳� ��Ʈ��ũ�� ������ �����ϱ� ���ؼ� ����ȭ�� ���� 
		 writeObject() : ����ȭ �Լ�
		 */
		//-----------------����ȭ ���̽㿡�� �߿�-----------------
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personHong);
			oos.writeObject(personKim);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//----------------������ȭ-------------------
		/*
		 ObjectInputStream : �����̳� ��Ʈ��ũ�� ���� ���� ���� ����ȭ�� �����͸� �ٽ� ������� ������ ����(�� ����ȭ)
		 readObject() : ������ȭ�� ���Ǵ� �޼ҵ� 
		 ����ȭ �ϱ� �� ��ü�� ĳ��������� �Ѵ�.
		 */
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
