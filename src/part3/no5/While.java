package part3.no5;

// while ��
public class While {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {	// false�� ���� ������ �ݺ���
			System.out.println(i++);
//			i++;		// i+=1;
		}
		
		
		// (ex) 1 ���� 100 ���� ��� ���ϱ�
		int sum = 0;
		int num = 1;
		while(num<=100) {
			sum += num++;
		}
		
		System.out.println(sum);
		
	
	}
}
