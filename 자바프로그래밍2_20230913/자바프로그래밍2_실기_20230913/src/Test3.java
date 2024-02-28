// 시작값과 끝값을 입력받아
// 끝값 ~ 시작값까지 출력하는 프로그램

// >> 결과화면<<

// 시작값 입력 :3
// 끝값 입력 : 3
// 시작값은 끝값 보다 작아야 합니다.


// 시작값 입력 : 2
// 끝값 입력 : 5

// 5 + 4 + 3 + 2 = xx 
// 5 ~ 2 사이의 누적합은 xx 입니다.

import java.util.*;

public class Test3 {
	public static void main (String[] args) {
		int i, start, stop, total = 0;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		while (true) {
			System.out.print("시작값 입력 : ");
			start = sc1.nextInt();
			System.out.print("끝값 입력 : ");
			stop = sc2.nextInt();
			
			if (start >= stop) {
				System.out.println("시작값은 끝값 보다 작아야 합니다.");
			}
			else {
				for (i = 0; i < stop - start + 1; i++) {
					total += start + i;
				}
				System.out.printf("%d ~ %d 사이의 누적값은 %d 입니다.", 
						stop, start, total);
			}
			break;
		}
	}
}
