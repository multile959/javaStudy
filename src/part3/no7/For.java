package part3.no7;

// for��
public class For {
	public static void main(String[] args) {
		
		// 1 ���� 100���� ��
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			// * 1 ���� 100���� �� �߿� 2�� ��� �� ��½�Ű����..
//			if(i % 2 != 0) {
//				continue;	// ������ �Ʒ��� ���������ʰ� �ٷ� ��������Ǵ� i++�� �ٷ� �ö�		
//			}
		
			total +=i;
			
			// * 1 ���� 50������ ���ϰ� �ʹٸ�..
			if(i == 50) {
				break;		// ������������ �ٷ� ������������			
			}
		}
		
		System.out.println(total);

		// continue�� break�� while, do-while������ ����� �� �ִ�
		
		
	}
}
