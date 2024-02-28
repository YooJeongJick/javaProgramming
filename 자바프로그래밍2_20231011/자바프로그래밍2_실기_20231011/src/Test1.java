
public class Test1 {

	public static void main(String[] args) {
		Car c1 = new Car(); // 지역변수, 참조변수, 객체(인스턴스)생성
		System.out.println("c1(" + c1.color + ", " + c1.door + ")");
		c1.start();
		
		Bus b1 = new Bus();
		System.out.println("b1(" + b1.color + ", " + b1.door + ", "
				+ b1.window +")");
		b1.start(); // 오버라이딩된 start();가 호출됨!!
		
		final int ABC = 123; // final로 선언된 변수는 보통 대문자로 작성
		
		Bus b2 = new Bus("green", 2, 10);
		System.out.println("b2(" + b2.color + ", " + b2.door + ", "
				+ b2.window +")");
		
		Bus b3 = new Bus("red", 3);
		System.out.println("b3(" + b3.color + ", " + b3.door + ", "
				+ b3.window +")");
	}

}
