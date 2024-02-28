// 자바 랜덤 구하기 -> Math.ranadom() 활용 (lang 패키지 내에 정의되어있음)

// 3명 학생의 점수(실수)를 1차원 배열을 다루는 score 준비(초기화 : 1, {1차원 초기화}, 2. 입력)

import java.util.*; // Scanner 클래스 사용하기 위해
public class Test2 {

	public static void main(String[] args) {
		int i, r; // 반복 제어 변수 i
		
		r = (int)(Math.random() * 4) + 2; // 2 ~ 5 사이의 랜덤값 발생하여 r에 대입!
		
		double[] score = new double[r];
		Scanner sc = new Scanner(System.in);
		
		System.out.println(r + "명 학생의 점수를 입력받고 출력합니다.\n");
		
		// 사용자 입력으로 초기화!!
		for (i = 0; i < score.length; i++) {
			System.out.print("학생" + (i + 1)+ " 점수 입력: ");
			score[i] = sc.nextDouble(); // 실수 1개 입력받아 score[i]에 대입!
		}
		
		System.out.println(); // 줄바꿈!
		
		// 점수 출력 부분
		for(i = 0; i < score.length; i++) {
//			System.out.println("학생" + (i + 1) + ": " + score[i] + "점");
			System.out.printf("학생%d: %5.1f점\n", i + 1, score[i]);
		}
	}

}
