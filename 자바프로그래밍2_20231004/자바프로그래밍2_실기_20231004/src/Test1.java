
public class Test1 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		Car c3 = new Car("yellow", 2);
		
		System.out.println("c1(" + c1.color + ", " + c1.door + ")"); // 10
		System.out.println("c2(" + c2.color + ", " + c2.door + ")"); // 11
		System.out.println("c3(" + c3.color + ", " + c3.door + ")"); // 12		
	}
}
