// 기본형 형변환
// byte - short - int - long - float - double
// 작음 ------------(자동형변환)-----------> 큼
// 작음 <-----------(강제형변환)------------ 큼

// 참조형 형변환
// 서로 상속관계에 있는 타입간의 형변환만 가능!
// UpCasting (자동형변환) : 자식 클래스 타입의 참조변수 -> 조상 클래스 타입의 참조변수
// DownCasting (강제형변환) : 조상 클래스 타입의 참조변수 -> 자식 클래스 타입의 참조변수
// 그 외 대입 불가

public class Test2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		c1 = c2; // 같은 타입의 경우 대입 가능!
		
		Bus b1 = new Bus();
		
		c1 = b1; // 업캐스팅(자동 형변환)
		b1 = (Bus)c1; // 다운캐스팅
	}

}
