package chapter16.generic1;

public class GenMain {

	public static void main(String[] args) {
		Gen gen = new Gen();
		
		Integer arr[] = new Integer[3];
		String arr2[] = {"abc","def","ghi"};
		Character arr3[] = {'A','B','C'};
		float arr4[] = new float[3];
		Double arr5[] = {1.1, 2.1, 3.33, 4.4, 5.5};
		
		System.out.print("문자열형 : ");
		gen.printArr(arr2);
		System.out.println();

		System.out.print("문자형 : ");
		gen.printArr(arr3);
		System.out.println();

		System.out.print("더블형 : ");
		gen.printArr(arr5);
	}
}
