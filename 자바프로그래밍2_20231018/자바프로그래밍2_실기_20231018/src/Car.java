// 클래스 정의시 extends가 없으면 컴파일러가 extends Object 자동 추가함!
// 자바의 최고 조상 클래스 : Object

// 클래스에는 1개 이상의 생성자가 있어야 함
// 생성자는 멤버 변수 초기화함!!
// 생성자는 클래스명과 같음(메소드와 유사하지만 메소드 아님 -> 반환타입x)

public class Car {
	String color;
	int door;
	
	Car() { // 기본 생성자
		this("red", 4); 
		// 같은 클래스의 다른 생성자 호출!
		// 꼭 첫 문장에 작성
		// this()가 작성된 생성자는 super();를 작성할 수 없음!
	}
	
	Car(String color, int door) { // 매개변수 있는 생성자
		super(); // 조상 클래스의 생성자 호출!!
		this.color = color;
		this.door = door;
	}

	
	void start() {
		System.out.println("자동차 출발~");
	}
}
