package part3.no2;

import java.util.Scanner;

// �� ������
public class LogicalOperators {
	
	// &&	(����) 		��� true�϶��� true		: and
	// ||	(����) 		���� �ϳ��� true���� true : or
	// !	(������) 	����� �ݴ��			: not
	// ^	(��Ÿ�� ����) 	�ϳ��� true�� �ϳ��� false�϶��� true�� ����	: xor
	
	public static void main(String[] args) {
		boolean t1 = true;
		boolean f1 = false;
		boolean t2 = true;

		
		System.out.println(t1 && f1);	// false
		System.out.println(t1 && t2);	// true
		System.out.println(t1 || f1); 	// true
		System.out.println(f1 || false);	// false
		
		// (ex) �Է��� ���� ���� 100 ~ 70 : ����, �̿ܿ� ����
		int score = 88;
		if(score <= 100 && score >= 70) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		System.out.println(t1 ^ t2);	// false
		System.out.println(t1 ^ f1);	// true
		
		System.out.println(!t1);		// false
		
		
		// ----------------------------------------
		// (PLUS+) �ܼ�â �Է��� ��� �ߴ���?
		
		Scanner sc =new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
		String name = sc.nextLine();
		
		System.out.println("\n�ݰ����ϴ�, "+ name+ "��!");
		
		
	
	}
	
}
