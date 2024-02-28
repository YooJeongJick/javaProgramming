public class Product {
	int price; // 제품가격
	int bp;  // 보너스 포인트
	
	Product(int price) {
		this.price = price;
		bp = price / 10; // 제품가격의 10%
	}
}
