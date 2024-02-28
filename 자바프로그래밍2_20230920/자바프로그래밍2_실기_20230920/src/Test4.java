// 로또 프로그램(5게임, 1~45사이 6개 숫자 추출)

// >> 결과화면 <<
//로또 번호 출력합니다.
//1회차 -> 20 10 12 5 45 3

public class Test4 {

	public static void main(String[] args) {
		int lotto[][] = new int[5][6];
		int i = 0;
		int j = 0;
		
		for (i = 0; i < lotto.length; i++) {
			for (j = 0; j < lotto[i].length; j++) {
				lotto[i][j] = (int)(Math.random() * 45) + 1;
			}
 		}
		
		System.out.println("로또 번호 출력합니다.");
		for (i = 0; i < lotto.length; i++) {
			System.out.printf("%d회차 -> ", (i + 1));
			for (j = 0; j < lotto[i].length; j++) {
				System.out.printf("%3d ", lotto[i][j]);
			}
			System.out.println();
 		}

	}
}
