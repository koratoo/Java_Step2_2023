package chapter21.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer2.txt")) {
			fw.write('A');
			fw.write(65);
			fw.write("65");//숫자 그대로 출력
			//배열
			char[] buf = {'B','C','D','E','F','G'};
			fw.write(buf);//배열을 한꺼번에 저장
			fw.write(buf,2,4);//배열의 일부분 저장
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("파일 생성 완료");
	}
}
