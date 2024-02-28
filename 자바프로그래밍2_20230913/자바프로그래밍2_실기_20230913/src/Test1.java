// 코드 정렬 : ctrl + shift + F
// 한 줄 조석 설정 및 해제 : ctrl + /
// 여러 줄 조석 설정 : ctrl + shift + /

// 사용자 키보드 입력하기위해 Scanner 클래스 객체 생성 -> nextInt(), nextDouble() 메소드를 활용
import java.util.*; // Scanner 클래스를 사용하기 위해 import
import java.lang.*; // lang 패키지는 import 하지 않아도 컴파일러가 자동 추가

public class Test1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		// 입력한 숫자가 1이상이면 홀/짝 and 배수 구하고,
		// 0이하 입력시 "에러메세지" 출력하고 다시 입력받기!

		while(true) {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			System.out.println("입력한 숫자는 " + n + "입니다.");
			
			if (n < 1) 
				System.out.println("1 이상만 입력 가능합니다.\n");
			else {
				if (n % 2 == 0) 
					System.out.println("짝수이군요.");
				else 
					System.out.println("홀수이군요.");
				
				// 4의 배수이거나 또는 9의 배수인지 판별하는 프로그램!
				if (n % 4 == 0 || n % 9 == 0) 
					System.out.println("4의 배수이거나 또는 9의 배수이군요.");
				else 
					System.out.println("4의 배수이거나 또는 9의 배수가 아니군요.");
				
				break; // 나와 가장 가가운 조건/반복문{블럭}을 벗어남 (단, if문 제외)
			}
		}
	}
}