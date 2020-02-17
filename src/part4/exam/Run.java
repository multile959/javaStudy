package part4.exam;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		
		
		// 1�� ����

		//  *
		// ***
		//*****
		// ***
		//  *

		// - String[] ����ؼ� Ǫ�� ���
		String[] arr = {"  *"," ***", "*****", " ***", "  *"};
		for(String str : arr) {
			System.out.println(str);
		}
		
		
		// - ���밪 ����ؼ� Ǫ�¹��
		for (int i = 0; i < 5; i++) {

			// ����	> 	���� 		��
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

		// 2�� ����

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

		// 3������ : Ȧ�� �Է¹޾Ƽ� �ڵ����� ������ �ϱ�

		// ex) 7
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *

		// ������ �� Ǯ�̰����� ����.

		// i = -2 	���� 	1~2 	��	 1~1
		// i = -1 	���� 	1~1 	��	 1~3
		// i = 0 	���� 	0		��   	 1~5
		// i = 1 	���� 	1~1 	�� 	 1~2
		// i = 2 	����  1~2 	�� 	 1~1

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("==== �ڵ� ����� ���α׷� ====");
			System.out.print("Ȧ���� �Է����ּ���(0�� ������ �����մϴ�) : ");
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
				System.out.println("����");
				return;
			} else {
				System.out.println("* Ȧ���� �Է��� �� �ֽ��ϴ�!");
			}
		}

	}
}
