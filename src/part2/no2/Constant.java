package part2.no2;

// ���
public class Constant {

	public static void main(String[] args) {
		// ��� = ���Ŀ��� �������ʴ� ��
		int i;
		i = 10;
		i = 20;
		

		final int J = 100;	// ����� �빮�� ����Ģ�� ����Ѵ�.
//		J = 200;			// ���� �����Ϸ��ϸ� ������ ������ ���.
		
		// * ���� ���� ���ϱ�
		double circleArea;
//		circleArea = 3 * 3 * 3.14159;
		// �߸� �� �� �ִ� �������� final�� ����
		final double PI = 3.14158;
		circleArea = 3 * 3 * PI;
		
		// * �⸧�� ���ϱ�
		final int OIL_PRICE=1450;	// ����� ����ٷ� ����!
		int totalPrice = 50 * OIL_PRICE;
		
		
	}
}
