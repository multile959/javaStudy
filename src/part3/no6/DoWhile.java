package part3.no6;

import java.util.Scanner;

// do-while
public class DoWhile {
	public static void main(String[] args) {
		
		int value = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			// �ݺ��� �����(�ѹ��� �ݵ�� ����)
			System.out.print("���� �Է����ּ��� : ");
			value = sc.nextInt();
		}while(value != 10);
		
		System.out.println("�ݺ��� ����!");
	}
}
