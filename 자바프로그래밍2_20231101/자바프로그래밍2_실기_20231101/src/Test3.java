// throws : 메소드 정의시 발생 가능한 예외 선언

public class Test3 {

	public static void main(String[] args) {
		
		try {
			method1(); 
			// 호출하는 메소드가 떠넘기기(throws)를 했기 때문에 호출하는 곳에서 예외처리 필수!
		} 
		catch(Exception e) {
			System.out.println("메인 메소드에서 처리합니다.");
			System.out.println(e.getMessage());
			return; // 메소드를 종료하는 return;문이라도 꼭 finally를 실행함!!
		} 
		finally { // 예외 발생 해도 안해도 마지막에 꼭 finally를 실행함!!
			System.out.println(1);
		}
	}
	
	static void method1() throws Exception { 
		// 메소드 정의시 throws로 발생 가능한 예외 나열! 
		method2();
	}
	
	static void method2() throws Exception { 
		throw new Exception("예외메시지입니다");
	}

}
