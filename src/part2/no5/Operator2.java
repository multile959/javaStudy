package part2.no5;

// �񱳿�����
public class Operator2 {
	public static void main(String[] args) {
		// ==	 !=		 <	  >	  <=	  >=
		//����	�ٸ���	ũ��	 �۴�	ũ�ų�����	�۰ų�����
		
		// �񱳿������� ����� boolean ���̴�.
		// * = �� �ܼ����Կ�����
		int i = 10;	
		int j = 10;
		
		System.out.println(i == j);		// true
		System.out.println(i != j);		// false
		System.out.println(i < j);		// false
		System.out.println(i <= j); 	// true
		System.out.println(i > j); 		// false
		System.out.println(i >= j); 	// true
		
		// * ���մ��Կ�����
		i += 10;	// i = i + 10;
		i -= 10;	// i = i - 10;
		i /= 2;		// i = i / 2;
		i *= 2;		// i = i * 2;
		i %= 10;	// i = i % 10;
		System.out.println(i);	// 0
	}
}
