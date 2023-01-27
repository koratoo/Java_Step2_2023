package chapter14.String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		String strNow1 = now.toString();
		System.out.println("----------DATA------------");
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.toString();
		System.out.println("-----SimpleDateFormat-----");
		System.out.println(strNow2);
			
		
	} 
	
}
