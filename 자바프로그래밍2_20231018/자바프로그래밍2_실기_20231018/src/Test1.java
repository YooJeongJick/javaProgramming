// 추상클래스(깡통) : 클래스 정의시 앞에 abstract를 붙인 클래스
// (1개 이상 추상 메소드를 가지고 있는 클래스)
// 추상클래스는 객체 생성 불가!!

// 추상메소드 : 클래스 정의시 앞에 abstract를 붙인 메소드
// (헤더는 있고, 바디는 없음)

// 인터페이스(왕깡통) : 변수(static final), 메소드(abstract)

abstract class A { // 추상클래스 A 정의
	int a; // 멤버 변수
	
	void add() { // 멤버 메소드
		System.out.println("A클래스의 add() 메소드입니다.");
	}
	abstract void add2(); // 추상 메소드 (구현부 x)
}

class B extends A { // 클래스 B 정의 (부모 : A클래스(추상), 자식 : B클래스)
	int b; // 멤버 변수
	
	void add2() { // 오버라이딩(조상 클래스에 정이된 메소드를 자식 클래스에서 재정의)
		System.out.println("B클래스의 add2() 메소드입니다.");
	}
}

class C implements Inter { // 인터페이스는 상속하는 것이 아닌 구현하는 것!!
	public void fun1() {}
	public void fun2() {}
}

public class Test1 {

	public static void main(String[] args) {
		B b1 = new B();
		C c1 = new C();
	}

}
