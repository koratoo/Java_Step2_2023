package chapter21.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	//����� Ŭ���� �� �����ϰ� ������� ���ÿ� ������
	//�����͸� �̿��Ͽ� ���ÿ� ������� �����ϴ�.
	//�پ��� �ڷ��� �޼��� ����
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
		rf.writeInt(100);
		System.out.println("���� �������� ��ġ : "+rf.getFilePointer());
	}
}
