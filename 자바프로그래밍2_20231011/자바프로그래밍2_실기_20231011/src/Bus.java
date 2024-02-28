// 자바는 단일 상속만 가능!!
// 생성자는 상속 대상이 아님!!

// super() : 조상의 생성자 호출
// super. : 조상의 멤버 변수 / 메소드에 접근시 사용

public class Bus extends Car {  
	// Bus 클래스 정의(부모클래스 : Car, 자식클래스 : Bus)
	int window;
	
	Bus() {
		super(); // 바로 위 부모클래스의 생성자 호출! 
		// Car(); 와 같지만 super();로 작성해야함!
		// this(); 가 없으면 항상 첫 문장에 super(); 컴파일러가 추가
		window = 10;
	}
	
	Bus(String color, int door, int window) {
		super(color, door); // 매개변수 있는 조상 생성자 호출!!
		this.window = window;
	}
	
	Bus(String color, int door) {
		super(color, door);
		this.window = 10;
	}
	
	void start() { // 오버라이딩(상속관계, 부모 클래스에 정의된 메소드를 자식 클래스에서 재정의)
		System.out.println("버스 출발~");
		super.start();
	}
	
}
