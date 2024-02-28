// java.lang 패키지 Object, String, Math 등

// 랩퍼클래스(wrapper) : 기본형을 클래스로 정의한 것
// (boolean -> Boolean, char -> Character, double -> Double)

// 두 점의 거리를 구하는 프로그램
// p1(x, y)와 p2(x, y) 사이의 거리

public class Test4 {

	public static void main(String[] args) {
		int p1_x = 4, p1_y = 5, p2_x = 7, p2_y = 8, w, h;
		double dist;
		
		w = p1_x - p2_x;
		h = p1_y - p2_y;
		
		dist = Math.sqrt((w * w) + (h * h));
//		java.lang.Math.sqrt();
		
		System.out.println(dist);
		
		// 문자열.valueOf(any type) : any type -> 문자열
		// Integer.parseInt(문자열) : 문자열 -> any type
		
		String str = "100";
		int n = 200;
		
		System.out.println(str.valueOf(n) + 200); // 200 -> "200"
		System.out.println(Integer.parseInt(str) + 200); // "200" -> 200

	}
}
