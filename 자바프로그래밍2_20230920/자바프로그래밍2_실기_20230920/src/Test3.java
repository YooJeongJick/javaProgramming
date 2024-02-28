// 2차원 배열 활용

public class Test3 {

	public static void main(String[] args) {
		int i, j; // 2차원 배열 행과 열을 표현하기 위해 추가
		
		int arr1[][]; // 2차원 배열을 다루는 변수 arr1 선언!
		arr1 = new int[3][4]; // 3행 4열
		
		int arr2[][] = new int[4][2]; // 열이 사이즈 고정일 경우 고정배열
		
		int[][] arr3 = new int[][] { {1,2,3,4,5}, {3,4,5}, {5,6} };
		int[][] arr4 = { {1,2}, {3,4}, {5,6} };
		// 선언과 초기화 동시에 할 경우 new int[][] 생략 가능
		
		for (i = 0; i < arr3.length; i++) { // 행 제어, i는 0, 1, 2
			for (j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
