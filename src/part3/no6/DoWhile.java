package part3.no6;

import java.util.Scanner;

// do-while
public class DoWhile {
	public static void main(String[] args) {
		
		int value = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			// 반복할 문장들(한번은 반드시 실행)
			System.out.print("값을 입력해주세요 : ");
			value = sc.nextInt();
		}while(value != 10);
		
		System.out.println("반복문 종료!");
	}
}
