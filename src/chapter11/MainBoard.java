package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		Player player =new Player();
		player.play(1);

		//���� 2�ܰ�
		AdvancedLevel alevel=new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(1);
		
		//���� 3�ܰ�
		SuperLevel slevel = new SuperLevel();
		player.upgradeLevel(slevel);
		player.play(2);
		
	}
	
}
