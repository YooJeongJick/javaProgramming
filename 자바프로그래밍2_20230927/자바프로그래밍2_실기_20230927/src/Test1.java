// 객체지향개념 (3가지 특징)
// 1. 캡슐화
// 2. 상속
// 3. 다형성

// 클래스 : 변수(속성) + 메소드(기능)
// 객채(인스턴스) : 클래스 구조에 맞춰 객체 생성!

public class Test1 {
	public static void main(String[] args) {
		int a = 10; // 지역변수 (초기화하지 않으면 쓰레기값)
		
		Car c1 = new Car(); // 지역변수, 참조변수, 객체(인스턴스) c1 생성
		Car c2 = new Car("yellow", 2, true);
		Car c3 = new Car(3, false);

		System.out.println("c1(" + c1.color + ", " + c1.door + ", "
				+ c1.power + ")");
		System.out.println("c2(" + c2.color + ", " + c2.door + ", "
				+ c2.power + ")");
		System.out.println("c3(" + c3.color + ", " + c3.door + ", "
				+ c3.power + ")");
		
		c1.color = "green";
		c1.onOff(); 
		c1.start();
		
		Car.stop();
	}
}
