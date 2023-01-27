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

	//String의 문자열로 출력해주는 toString재정의
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+", "+author;
	}
	
	
	
}

public class ToStringEx01 {

	public static void main(String[] args) {
		Book book = new Book("자바","홍길동");
		
		System.out.println(book);
		System.out.println(book.toString());
		
		String str = new String("test");
		System.out.println(str);
	}
}