package chapter14.String;

import java.util.Date;

class Book{
	String title;
	String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	//String�� ���ڿ��� ������ִ� toString������
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+", "+author;
	}
	
	
	
}

public class ToStringEx01 {

	public static void main(String[] args) {
		Book book = new Book("�ڹ�","ȫ�浿");
		
		System.out.println(book);
		System.out.println(book.toString());
		
		String str = new String("test");
		System.out.println(str);
	}
}