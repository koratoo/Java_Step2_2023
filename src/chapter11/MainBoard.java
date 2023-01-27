package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		Player player =new Player();
		player.play(1);

		//레벨 2단계
		AdvancedLevel alevel=new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(1);
		
		//레벨 3단계
		SuperLevel slevel = new SuperLevel();
		player.upgradeLevel(slevel);
		player.play(2);
		
	}
	
}
