package part4.exam;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		
		
		// 1번 문제

		//  *
		// ***
		//*****
		// ***
		//  *

		// - String[] 사용해서 푸는 방법
		String[] arr = {"  *"," ***", "*****", " ***", "  *"};
		for(String str : arr) {
			System.out.println(str);
		}
		
		
		// - 절대값 사용해서 푸는방법
		for (int i = 0; i < 5; i++) {

			// 순서	> 	공백 		별
			// 0 	-> 	 2 		1
			// 1 	-> 	 1 		3
			// 2 	-> 	 0 		5
			// 3 	-> 	 1 		3
			// 4 	-> 	 2 		1

			for (int j = 0; j < Math.abs(2 - i); j++) {
				System.out.print(" ");
			}
			if (i < 3) {
				for (int k = 0; k < (i * 2) + 1; k++) {
					System.out.print("*");
				}
			} else if (i == 3) {
				for (int k = 0; k < i; k++) {
					System.out.print("*");
				}
			} else {
				for (int k = 0; k < i - 3; k++) {
					System.out.print("*");
				}
			}

			System.out.println();
		}

		System.out.println();

		// 2번 문제

		// *************
		// *           *
		// *           *
		// *           *
		// *************

		for (int i = 0; i < 5; i++) {
			if (i == 0 || i == 4) {
				for (int j = 0; j < 13; j++) {
					System.out.print("*");

				}
				System.out.println();
			} else {
				System.out.print("*");
				for (int j = 0; j < 11; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}

		// 3번문제 : 홀수 입력받아서 자동으로 찍히게 하기

		// ex) 7
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *

		// 옛날에 본 풀이과정을 응용.

		// i = -2 	공백 	1~2 	별	 1~1
		// i = -1 	공백 	1~1 	별	 1~3
		// i = 0 	공백 	0		별   	 1~5
		// i = 1 	공백 	1~1 	별 	 1~2
		// i = 2 	공백  1~2 	별 	 1~1

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("==== 자동 별찍기 프로그램 ====");
			System.out.print("홀수를 입력해주세요(0을 누르면 종료합니다) : ");
			int num = sc.nextInt();

			if (num % 2 == 1) {
				for (int i = -(num / 2); i <= (num / 2); i++) {
					
					int k = i < 0 ? -i : i;
					
					for (int j = 0; j < k; j++) {
						System.out.print(" ");
					}
					
					for (int j = 0; j < num - 2 * k; j++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
			} else if (num == 0) {
				System.out.println("종료");
				return;
			} else {
				System.out.println("* 홀수만 입력할 수 있습니다!");
			}
		}

	}
}
