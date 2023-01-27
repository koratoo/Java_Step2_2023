package chapter19.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		//sum() �� Integer�� ��ȯ�ϹǷ� int 
		//Integer�� �ڵ� ��ڽ��� ��. ������ ����ȯ
		
		//�ѹ� ������ ��Ʈ���� �� ���� �ٽ� �����ؾ���
		int sumVal=Arrays.stream(arr).sum();//�հ�
		//         Long->int �ٿ�ĳ����
		int count=(int)Arrays.stream(arr).count();//����
		
		System.out.println(sumVal);
		System.out.println(count);
		
		//int => IntStream ����ȯ
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		
		//�̹� ��������Ƿ� �Ҹ�� stream
		//count = stream.count();//Error
		//�ٽ� ����Ϸ���?
		int count2 = (int)Arrays.stream(arr).count();//�缱�� ���
		//reduce(�ʱ갪,���޵Ǵ� ��� -> �� ��Ұ� �����ؾ� �ϴ� ���)
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
	}
}
