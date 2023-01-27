package chapter21.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long millisecond=0;

		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip"))
		{
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i=fis.read())!= -1) {
				fos.write(i);
			}
			millisecond=System.currentTimeMillis()-millisecond;
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("파일 복사 하는데 "+millisecond+"millisecond가 소요 되었습니다.");
	}
}
