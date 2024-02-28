// 클래스명은 보통 대문자로 시작!
// 클래스는 1개 이상의 생성자가 있어야 함!
// 생성자를 구현하지 않으면 컴파일러가 자동으로 기본생성자를 추가해 줌 -> Car(){}
// 생성자는 메소드 같지만 메소드는 아님!! -> 생성자는 리턴(반환)값이 없음 -> 앞에 void(x)
// 생성자는 멤버 변수의 초기화 담당!

// 멤버 변수 or 멤버 메소드 앞에 static이 있고 없고 차이!!
// static이 없는 경우 : 인스턴스 변수 or 인스턴스 메소드
// 객체 생성해야지만 접근할 수 있는 변수 or 메소드!

// static이 있는 경우 : 클래스 / static / 공유(공용) 변수 or 메소드
// 객체 생성해도 되고, 안해도 접근할 수 있는 변수 or 메소드!
// 클래스명.클래스변수 -> 클래스명으로 접근 가능!!

public class Car { // Car 클래스 정의
	String color; // 멤버변수 (초기화하지 않으면 기본값)
	// 정수 0, 실수 0.0, boolean false, 참조형 null
	static int door; // 클래스(static) 변수
	boolean power;
	
	Car() { // 기본 생성자
		color = "black"; // this는 선택 여부
		door = 4;
		power = false;
	}
	
	Car(int door, boolean power) { // 매개변수 있는 생성자
		color = "black"; // this는 선택 여부
		this.door = door;
		this.power = power;
	}
			
	Car(String color, int door, boolean power) { // 매개변수 있는 생성자
		this.color = color; 
		// 그냥 color = color; 한다면 앞에 color를 String color로 앎
		// this.은 객체 자신의 주소
		this.door = door;
		this.power = power;
	}

	void start() { // 멤버 메소드
		System.out.println("출발~");
	}
	
	static void stop() {
		System.out.println("멈춤~");
	}
	
	void onOff() {
		power = !power;
		System.out.println("시동 : " + power);
	}
}
