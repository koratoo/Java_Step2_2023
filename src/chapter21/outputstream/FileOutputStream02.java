package chapter21.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream02 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		fos = new FileOutputStream("output3.txt");
		
		fos.write(71);
		fos.write(72);
		fos.write(73);
		
		fos.flush();
		fos.close();
		
		System.out.println("파일이 생성 되었습니다.");
	}
}
