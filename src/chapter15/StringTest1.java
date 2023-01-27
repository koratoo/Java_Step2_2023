package chapter15;

public class StringTest1 {

	public static void main(String[] args) {
		
		String javaStr= new String("java "); //Èü
		String androidStr = new String(" android");//Èü
		System.out.println(javaStr);//toString
		System.out.println(javaStr.hashCode());//10Áø¼ö
		System.out.println(System.identityHashCode(javaStr));//16Áø¼ö
		
		
		javaStr=javaStr.concat(androidStr);
		System.out.println();
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));
		
	}
}

