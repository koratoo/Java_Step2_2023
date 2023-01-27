package chapter21.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		
		fis = new FileInputStream("reader.txt");
		int i;
		while((i=fis.read())!= -1) {
			System.out.println((char)i);
		}
		fis.close();
		System.out.println("end");
	}
}
