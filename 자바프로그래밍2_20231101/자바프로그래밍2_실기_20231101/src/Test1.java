// 예외처리(Exception Handling)
// try { 예외 발생 가능성 있는 문장들; };
// catch(예외클래스 변수) { 해당 예외 발생시 처리 문장; }
// finally { 예외 발생 or 발생하지 않더라도 마지막에 실행할 문장; }

// getMessage() : 해당 예외 메시지 내용(문자열)을 리턴
// printStackTrace : 스택 경로를 콘솔창에 출력!

public class Test1 {

	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(3 / 0); // ArithmeticException 발생!
			System.out.println(4);
		} catch(ArithmeticException ae) {
			System.out.println(5);
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		
		System.out.println(6);
	}
}
