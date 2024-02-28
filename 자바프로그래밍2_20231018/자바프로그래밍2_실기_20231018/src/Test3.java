// 다형성 : 조상타입의 참조변수로 자식타입의 객체를 다룰 수 있는 것
// 메소드에서 매개변수 다형성!

public class Test3 {

	public static void main(String[] args) {
		Tv t1 = new Tv(); // 옛날 리모컨 -> 옛날 Tv
		CaptionTv ctv1 = new CaptionTv(); // 최신 리모컨 -> 최신 Tv
		
//		CaptionTv ctv2 = new Tv(); // error!!
		Tv t2 = new CaptionTv(); // 다형성
	}

}
