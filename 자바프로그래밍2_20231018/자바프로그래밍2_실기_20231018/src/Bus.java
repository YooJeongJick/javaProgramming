
public class Bus extends Car {
	int window;
	
	Bus() {
		super(); // 바로 위 조상 생성자 호출, Car(); 와 같음 
		window = 10;
	}
	
	void start() { 
		// 오버라이딩 : 조상 클래스에 정의된 메소드를 자식클래스에서 재정의 한 것!
		System.out.println("버스 출발~");
	}
}
