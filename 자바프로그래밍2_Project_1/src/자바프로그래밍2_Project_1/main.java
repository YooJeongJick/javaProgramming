package 자바프로그래밍2_Project_1;

import java.util.*;

public class main {
	
	static int[] changeNum1(String num)
	{
		String arr1[] = num.split(" ");
		
		int arr2[] = new int[4];
		
		for (int i = 0; i < 4; i++)
			arr2[i] = Integer.parseInt(arr1[i], 2);
				
		return arr2;
	}
	
	static String[] changeNum2(String num)
	{
		String arr1[] = num.split("\\.");
		
		int arr2[] = new int[4];
				
		for (int i = 0; i < 4; i++)
			arr2[i] = Integer.parseInt(arr1[i]);
		
		String arr3[] = new String[4];
		
		for (int i = 0; i < 4; i++)
			arr3[i] = Integer.toBinaryString(arr2[i]);
		
		return arr3;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		String num;
		
		while(true) {
			System.out.println("IPv4 주소 변환기 입니다");
			System.out.println("원하시는 기능을 선택해주세요");
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 2진수 -> 10진수");
			System.out.println("2. 10진수 -> 2진수");
		
			System.out.print("=> ");
			choice = sc.nextInt();
			System.out.println();
			
			if(choice != 0 && choice != 1 && choice != 2)
				System.out.println("\n다시 입력해주세요\n");
			else {
				if(choice == 1) {
					System.out.println("1. 2진수 -> 10진수");
					System.out.println("2진수로 구성된 주소를 입력해주세요");
					System.out.println("Ex)00000000 00000000 00000000 00000000\n");
					
					sc.nextLine();
					System.out.print("=> ");
					num = sc.nextLine();
					System.out.println();
					
					int arr1[] = changeNum1(num);
					
					System.out.print(num + " -> ");
					for (int i = 0; i < 3; i++)
						System.out.print(arr1[i] + ".");
					System.out.println(arr1[3]);
					
					System.out.println("\n");
					
				} else if(choice == 2){
					System.out.println("2. 10진수 -> 2진수");
					System.out.println("10진수로 구성된 주소를 입력해주세요");
					System.out.println("Ex)111.11.111.11");
					
					sc.nextLine();
					System.out.print("=> ");
					num = sc.nextLine();
					System.out.println();
					
					String arr2[] = changeNum2(num);
					
					System.out.print(num + " -> ");
					for (int i = 0; i < 3; i++)
						System.out.print(arr2[i] + " ");
					System.out.println(arr2[3]);
					
					System.out.println("\n");

				} else {
					break;
				}
				
			}
		}
	}
}
