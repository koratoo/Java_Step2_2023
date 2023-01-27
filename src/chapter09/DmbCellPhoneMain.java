package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java폰","검정",10);
		
		System.out.println("----[CellPhone필드입니다.]----");
		//CellPhone으로부터 상속받은 필드
		dmbCellPhone.powerOn();
		dmbCellPhone.sendVoice("안녕하세요. 전화 걸었습니다.");
		dmbCellPhone.bell();
		dmbCellPhone.receiveVoice("안녕하세요. 전화 받았습니다.");
		dmbCellPhone.powerOff();

		System.out.println("----[DmbCellPhone필드입니다.]----");
		//DmbCellPhone의 필드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(11);
		dmbCellPhone.turnOffDmb();
		
		System.out.println("----[CellPhone을 사용한 전화 통화.]----");
		//CellPhone메소드를 통한 전화통화 구현
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.receiveVoice("안녕하세요. 두나은행입니다. ");
		dmbCellPhone.sendVoice("....");
		dmbCellPhone.powerOff();

		System.out.println("----[DmbCellPhone의 메소드를 사용하여 채널 바꾸기]----");
		//DmbCellPhone의 메소드를 사용하여 채널 바꾸기
		System.out.println("동생 : 축구볼테야");
		dmbCellPhone.changeChannelDmb(11);
		System.out.println("누나 : 드라마 봐야돼 ");
		dmbCellPhone.changeChannelDmb(9);
		System.out.println("동생 : 축구볼테야");
		dmbCellPhone.changeChannelDmb(11);

	}
}
