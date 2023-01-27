package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		Spider spider = new Spider();
		Bear bear = new Bear();
		Lion lion = new Lion();

		System.out.println("------------곰--------------");
		System.out.println("곰의 다리는 " + bear.getLeg() + "개 입니다.");
		System.out.println("곰의 눈은 " + bear.getEye() + "개 입니다.");
		bear.Gom();
		

		System.out.println("------------사자--------------");
		System.out.println("사자의 다리는 " + lion.getLeg() + "개 입니다.");
		System.out.println("사자의 눈은 " + lion.getEye() + "개 입니다.");
		lion.Galgi();
		
		
		System.out.println("------------거미--------------");
		System.out.println("거미의 다리는 " + spider.getLeg() + "개 입니다.");
		System.out.println("거미의 눈은 " + spider.getEye() + "개 입니다.");
		System.out.println("거미의 특징은 " +spider.web +"하는 거미줄입니다.");
		
	
	}
}
