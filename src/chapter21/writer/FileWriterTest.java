package chapter21.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer2.txt")) {
			fw.write('A');
			fw.write(65);
			fw.write("65");//���� �״�� ���
			//�迭
			char[] buf = {'B','C','D','E','F','G'};
			fw.write(buf);//�迭�� �Ѳ����� ����
			fw.write(buf,2,4);//�迭�� �Ϻκ� ����
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("���� ���� �Ϸ�");
	}
}
