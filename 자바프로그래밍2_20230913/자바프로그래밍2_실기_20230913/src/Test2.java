// 랜덤 구하기 -> Math 클래스의 random() 메소드 활용!

// Math.random()					: 0.0 <= r < 1.0
// Math.random() * 10				: 0.0 <= r < 10.0
// (int)(Math.random() * 10) 		: 0 <= r < 10
// (int)(Math.random() * 10) + 1 	: 1 <= r < 11

// 8 이상 : "오늘은 최고의 날!! 집으로!!"
// 4 이상 : "보통의 날!! 집으로!!"
// 3 이하 : "조심하시오. 나오지 마시오!"

// >> 결과화면 <<
// 오늘의 운세 : 5점
// ★★★★★
// "보통의 날!! 집으로!!"

public class Test2 {

	public static void main(String[] args) {
		int i, r = (int)(Math.random() * 10) + 1;
		
		System.out.printf("오늘의 운세 : %d점\n", r);
		
		for (i = 1; i <= r; i++) {
			System.out.print("★");
		}
		System.out.println();
		
		if (r >= 8) {
			System.out.println("오늘은 최고의 날!! 집으로!!");
		} else if (r >= 4) {
			System.out.println("보통의 날!! 집으로!!");
		} else {
			System.out.println("조심하시오. 나오지 마시오!");
		}
	}
}
