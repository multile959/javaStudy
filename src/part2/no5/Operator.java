package part2.no5;

// �����ڿ� �����
public class Operator {
	public static void main(String[] args) {
		/*
		 * [����]
		 * �����͸� ó���Ͽ� ����� ����
		 * 
		 * (ex) x = y + z;	 -->  y�� z�� ���Ѱ��� x�� �����Ѵ�.
		 * 
		 * ������(Operations) : ���꿡 ���Ǵ� ǥ�ó� ��ȣ
		 * �ǿ�����(Operand) : ���� ����� �Ǵ� ������(���ͷ�, ����)
		 * ����� (Expressions) : �����ڿ� �ǿ����ڸ� �̿��Ͽ� ������ ������ ����� ��
		 *
		 *---------------------------------------------------------
		 */
		// [������]
		// (1) ��ȣ ������ : + -		=> ���� ������
		// ������ �� ��ȣ�����ڰ� ������ 
		// +�� �״�� ����
		// -�� ������ �����, ����� ������ �����ϴ� ����
		
		int i1 = -5;	// -5
		int i2 = +i1;	// -5
		int i3 = -i1;	// 5
		
		// (2) ���� ������ : ++ --	=> ���� ������
		// * ����
		int i4 = ++i3; // 5+1 = 6
		System.out.println(i4);// i3 = 6	
		System.out.println(i3);
		
		// * ����
		int i5 = i3++; // 6
		System.out.println(i5); // i3 = 7   
		System.out.println(i3);
	
		// (3) ��� ������ : + - * / %(��ⷯ ����, ���� ��������)
		int i = 5;
		int j = 2;
		
		System.out.println(i+j);		// 7
		System.out.println(i-j);		// 3
		System.out.println(i*j);		// 10
		System.out.println(i/j);		// 2 	-->���������� ������ ���������� ���ϵ�
		System.out.println(i/(double)j);	// 2.5		(ĳ���ÿ���)
		System.out.println(i%j);		// 3
	}
}
