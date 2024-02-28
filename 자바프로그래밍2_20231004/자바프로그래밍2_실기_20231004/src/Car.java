// 멤버 초기화 방법
// 1. 명시적 초기화 방법
// 2. 생성자 초기화 방법(가장 많이 사용)
// 3. 초기화 블럭 방법
// 		{} : 인스턴스 초기화 블럭
// 		static {} : 클래스 초기화 블럭

public class Car {
	String color = "white"; // 멤버변수(static이 없는 변수 -> 인스턴스 변수)
	// 인스턴스 변수 : 객체 생성해야지만 접근 가능
	int door = 3; // 1. 명시적 초기화 방법 : 멤버 변수 서언과 동시에 초기화
	
	{ // 인스턴스 초기화블럭, 객체(인스턴스) 생성시 마다 호출됨(생성자 보다 먼저 호출됨)
		System.out.println("{} 인스턴스 초기화 블럭"); // 2, 5, 8
	}
	
	static { // 클래스 초기화 블럭, 클래스가 로딩될 때 단 한 번 호출됨!
		System.out.println("static{} 클래스 초기화 블럭"); // 1
	}
	
	Car() { // 기본 생성자
		this("black", 4); 
		System.out.println("기본생성자"); // 4
		// this()는 같은 클래스의 다른 생성자를 호출! 첫 문장으로 작성해야 함!
	}
	
	Car(String color) { // 매개변수 있는 생성자
		this(color, 4); // 2. 생성자 초기화 방법
		System.out.println("매개변수있는 생성자1"); // 7
	}
	
	Car(String color, int door) {
		this.color = color; // this.은 현재 객체의 주소
		this.door = door;
		System.out.println("매개변수있는 생성자2"); // 3, 6, 9
	}
	
	
	// 메소드 오버로딩 (서로 다른 메소드라고 생각함, 예로println())
	// 1. 메소드명이 같으면서
	// 2. 매개변수의 갯수가 다르거나
	// 3. 매개변수 타입이 다르면 오버로딩임
	// 단, 반환타입과 매개변수명과는 관계 없음
	
	void start() { // 멤버메소드
		System.out.println("출발");
	}
	
	void start(int n) { // 멤버메소드
		System.out.println("출발");
	}
}
