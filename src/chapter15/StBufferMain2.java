package chapter15;

public class StBufferMain2 {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		//贸澜 积己等 皋葛府狼 林家
		System.out.println("javaStr狼 贸澜 积己等 皋葛府 林家 : " +System.identityHashCode(javaStr));
	
		StringBuffer buffer = new StringBuffer(javaStr);
		System.out.println("楷魂 傈 buffer 皋葛府林家 : " + System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("JSP ");
		buffer.append("programming is fun!!");
		System.out.println("楷魂 饶 buffer 皋葛府林家 : " + System.identityHashCode(buffer));
		
		javaStr=buffer.toString();
		System.out.println(buffer);
		System.out.println("货肺 父甸绢柳 javaStr 概葛府 林家 : " +System.identityHashCode(javaStr));
	}
}
