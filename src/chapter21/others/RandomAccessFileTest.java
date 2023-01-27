package chapter21.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	//입출력 클래스 중 유일하게 입출력이 동시에 가능함
	//포인터를 이용하여 동시에 입출력이 가능하다.
	//다양한 자료형 메서드 제공
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
		rf.writeInt(100);
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
	}
}
