package chapter13;

import java.util.Scanner;

public class EnumMain {

	//enum�� �迭 ����...
	public enum Item {Start,Pause,Exit} //0 1 2
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("���ڸ� �Է��ϼ���[0:���ӽ���, 1:�Ͻ�����,2:��������] : " );
		
			int n = scan.nextInt();
			
			
			Item start = Item.Start;//start �� 0��
			Item pause = Item.Pause;//pause �� 1��
			Item exit  = Item.Exit;//exit �� 2��
				
				//ordinal : ���� ���ڸ� �����Ͷ�
				if(n == start.ordinal()) // n == 0 �ΰ���?
					System.out.println("������ ������");
				else if(n == pause.ordinal())
					System.out.println("������ ������");//n==1�ΰ���?
				else {
					System.out.println("������ ����");//n==2�ΰ���?
					return;//if�� ����������. break : ���⼭ ��
				}
				
			}//while end
		}
	}

