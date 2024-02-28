// 숫자로된 문자열을 입력받음

// next() : 개행문자(빈칸)를 무시하고 입력! (개행 전까지만 입력)
// nextLine() : 한줄 반위 입력(개행 포함)

import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;

		try {
			System.out.print("숫자로된 문자열 입력 : ");
			str = sc.next();
			
			System.out.println(Integer.parseInt(str) + 100);
		} catch(NumberFormatException nfe) {
			System.out.println("예외 발생!");
		}
		
	}
}
