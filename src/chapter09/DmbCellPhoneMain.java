package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java��","����",10);
		
		System.out.println("----[CellPhone�ʵ��Դϴ�.]----");
		//CellPhone���κ��� ��ӹ��� �ʵ�
		dmbCellPhone.powerOn();
		dmbCellPhone.sendVoice("�ȳ��ϼ���. ��ȭ �ɾ����ϴ�.");
		dmbCellPhone.bell();
		dmbCellPhone.receiveVoice("�ȳ��ϼ���. ��ȭ �޾ҽ��ϴ�.");
		dmbCellPhone.powerOff();

		System.out.println("----[DmbCellPhone�ʵ��Դϴ�.]----");
		//DmbCellPhone�� �ʵ�
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(11);
		dmbCellPhone.turnOffDmb();
		
		System.out.println("----[CellPhone�� ����� ��ȭ ��ȭ.]----");
		//CellPhone�޼ҵ带 ���� ��ȭ��ȭ ����
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.receiveVoice("�ȳ��ϼ���. �γ������Դϴ�. ");
		dmbCellPhone.sendVoice("....");
		dmbCellPhone.powerOff();

		System.out.println("----[DmbCellPhone�� �޼ҵ带 ����Ͽ� ä�� �ٲٱ�]----");
		//DmbCellPhone�� �޼ҵ带 ����Ͽ� ä�� �ٲٱ�
		System.out.println("���� : �౸���׾�");
		dmbCellPhone.changeChannelDmb(11);
		System.out.println("���� : ��� ���ߵ� ");
		dmbCellPhone.changeChannelDmb(9);
		System.out.println("���� : �౸���׾�");
		dmbCellPhone.changeChannelDmb(11);

	}
}
