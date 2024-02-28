// 배열 선언 방법

public class Test1 {
	public static void main(String[] args) {
		
		int arr1[]; // 1차원 배열을 다루는 변수 선언
		arr1 = new int[5]; // int형 타입(정수)의 연속된 공간을 확보하여 주소를 arr1에 대입
		
		int arr2[] = new int[] { 1, 2, 3, 4, 5 };

		int arr3[] = { 1, 2, 3 }; // 배열을 다루는 변수 선언 및 {1차원초기화방법}
		// {1차원초기화방법}으로 할 경우 new int[] 생략
	}
}
