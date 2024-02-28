
public class Test4 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		
		Audio a1 = new Audio();
		Radio r1 = new Radio();
		Video v1 = new Video();
		
		b1.buy(a1);
		b1.buy(r1);
		b1.buy(v1);
		
		System.out.println("현재 남은 돈 : " + b1.money + "만원");
		System.out.println("현재 보너스 점수 : " + b1.bp + "만점");
		
//		System.out.println(b1.toString()); // 클래스명@16진수 (해쉬코드)
//		System.out.println(a1); 
		// 참조변수를 출력할 경우 자동으로 toString() 메소드를 호출함!
		// Object 클래스의 정의된 toString() 메소드
	}
}








