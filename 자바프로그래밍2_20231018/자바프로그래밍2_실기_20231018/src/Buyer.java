
public class Buyer {
	int money = 1000; // 고객 소유 금액
	int bp = 0; // 보너스 점수
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액 부족!");
			return; // 메소드를 종료하고 호출한 곳으로 돌아감
		}
		
		money = money - p.price;
		bp = bp + p.bp;
		
		System.out.println(p + " 구입하셨습니다.");
		// 참조변수를 출력하는 것은 p.toString(); 와 같음
	}
}
