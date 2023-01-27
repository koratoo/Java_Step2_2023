package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest05 {
	
	public static void main(String[] args){
		
	try (FileOutputStream fos = new FileOutputStream("resource.txt",true);
		FileInputStream fis = new FileInputStream("resource.txt")){
			fos.write(65);//A에 대응되는 문자로 저장
			fos.write(66);//B에 대응되는 문자로 저장
			fos.write(67);//C에 대응되는 문자로 저장
		
			//읽기
			System.out.println((char)fis.read()+" ");
			System.out.println((char)fis.read()+" ");
			System.out.println((char)fis.read()+" ");
		
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
	}
	
}
