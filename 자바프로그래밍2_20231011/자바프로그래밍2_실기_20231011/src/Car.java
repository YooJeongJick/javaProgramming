// 클래스에는 1개 이상의 생성자가 있어야 함!!(1개도 없으면 컴파일러가 기본 생성자 추가해 줌)
// 자바의 최고 조상 클래스 : Object (toString() 등 약10개 정도 메소드 정의되어있음)
// 클래스 정의시 extends 가 없으면 컴파일러가 자동으로 extends Object 추가해 줌!!

// 제어자(modifier)
// static
// 멤버 변수, 멤버 메소드 앞에 static이 붙으면 객체 생성하지 않아도 클래스명으로 접근 가능!
// static { } : 클래스 초기화블럭(클래스 로딩시 단 1회 호출됨)  

// final(값 변경 불가)
// 지역변수 : 선언과 동시에 초기값 그대로 사용, 변경 할 수 없음!
// 멤버변수 : 1. 명시적초기화, 2. 생성사 초기화 -> 1 or 2에서 초기화 해야 함!!! 값 변경 불가
// 멤버메소드 : 오버라이딩 금지!!, 값 변경 할 수 없음!
// 클래스 : 상속 금지!!(자식클래스 x) 값 변경 할 수 없음!

// 접근 제어자 (access modifier)
// public : 모든 클래스에서 접근 가능!
// protected : 같은 패키지 + 다른 패키지 자손 클래스
// (default) : 같은 패키지
// private : 같은 클래스에서만 접근 가능!

// 클래스 : 클래스 앞에는 public 이나 (default)만 작성 가능!
// 멤버 변수/메소드 : 앞에 접근 제어자 4개 모두 가능!

import java.lang.*; // 컴파일러가 자동으로 추가해 줌!

public class Car extends Object { // Car 클래스 정의
	String color; // 멤버 변수(인스턴스 변수 : 객체 생성해야지만 접근 가능)
	static int door = 4; 
	// 초기화 하지 않으면 기본값(정수 0, 실수 0.0, 참조형 null, boolean false)
	// static 을 앞에 작성하면, static/클래스/공유(공용) 변수 
	
	Car() { // 기본 생성자
		this("black", 4); // 같은 클래스 내의 다른 생성자 호출! 무조건 첫 문장에 와야 함!
	}

	Car(String color, int door) { // 매개변수 있는 생성자
		super(); // Object(); 호출함!
		this.color = color;
		this.door = door;
	}

	void start() {
		System.out.println("자동차 출발~");
	}
}
