//자바의 기본형(8개)
//boolean(1byte) - true, false 만 저장 가능
//char(2byte) - 문자 1개 / C언어는 1byte
//byte(1byte) - 정수
//short(2byte) - 정수
//int (4byte) - 정수
//long (8byte) - 정수
//float(4byte) - 실수
//double(8byte) - 실수, 기본값

//자바의 참조형(클래스명, 주소만 저장 가능한 타입)
//주소만 저장가능하기 때문에 4byte 사이즈

//"문자열" + any type => "문자열"로 연결!

//형식지정자
//%d : 정수
//%f : 실수
//%c : 문자 1개
//%b : 논리형(boolean타입, true or false)
//%s : 문자열
//%x : 16진수
//%% : %

//정수 / 정수 => 실수
//실수 / 정수 => 실수
//정수 / 실수 => 실수
//실수 / 실수 => 실수

public class Test1 {

	public static void main(String[] args) {
		// 기본형으로 변수 선언 및 초기화
		boolean a = true;
		char ch = 'a'; // ' '도 하나의 char로 인정
		int b = 10;
		int c = 7;
		
		System.out.printf("%d / %d = %.2f\n", b, c, ((double)b / c)); 
		// 오류 방지를 위해 괄호 필수, (double)b / c 랑 (double)b / (double)c 모두 가능
		
		// 참조형으로 변수 선언 및 초기화
		String str = "hello"; // 참조변수 str
		// String str = new String() 대신 " "으로도 가능하도록
		
		System.out.println("str의 값은 " + str + " 입니다.");
		// System.out.println("a = " + a + ", b =" + b + ", ch = " + ch + "입니다.");
		System.out.printf("a = %b, b = %d, ch = %c 입니다.", a, b, ch);
	}

}
