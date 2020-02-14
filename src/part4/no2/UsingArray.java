package part4.no2;

public class UsingArray {
	public static void main(String[] args) {
		
		int[] arr = new int[100];
		arr[0] = 1;
		arr[1] = 2;
	
		// 100¥�� ũ���� �迭�� 1���� 100���� ���ʴ�� �ֱ�
		
		for(int i = 0 ; i< arr.length; i++) {
			arr[i] = i+1;
		}
		
		/*
		// Ȯ�ο�
		for(int num : arr) {
			System.out.print(num+"\t");
			
			if(num%10==0)
				System.out.println();
		}
		*/
		
		/* ������ ������ ���� ������ ����� ���ִ� ����(scope)�� �޶�����
		 * ������ �� ���� ������ �Ҹ�ȴ�.
		 * (for�� ������ int i �� ���µ� �ٸ� for�������� int i �� ������ ���������� ����)
		 */
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		
	}
}
