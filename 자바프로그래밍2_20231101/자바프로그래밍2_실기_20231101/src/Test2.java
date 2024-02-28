// throw : 강제 예외 발생
// throws : 메소드 정의시 발생 가능한 예외 선언

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1;
		int arr[] = { 1, 2, 3, 4, 5 };
		
		try { // 예외 발생 가능성 있는 문장 있을 수 있음!
//			System.out.print("실수 입력 : ");
//			n1 = sc.nextDouble();
//			System.out.println("n1 = " + n1);
			
//			System.out.println("arr[5] = " + arr[5]);
			
//			Exception e = new Exception(); // 객체 생성
//			throw e; // 강제로 예외 발생!
			// 위의 2줄과 아래 1줄은 같음!
			
			throw new Exception();
			
		} catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(InputMismatchException ime) {
			System.out.println("숫자만 입력 가능합니다.");
		} catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("index 범위 이상!");
		} catch(Exception e) { // 광범위한 예외 처리 클래스!!, catch문 마지막에 작성!
			System.out.println("예외 발생!");
		}
		
	}
}
