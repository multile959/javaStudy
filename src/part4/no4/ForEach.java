package part4.no4;

public class ForEach {
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		System.out.print("for�� ��� : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
		System.out.print("\n"+"for each�� ��� : ");
		for(int num : arr) {
			System.out.print(num +" ");
		}
		
		
		// for���� ������ �迭&�ڷᱸ���� ũ�⸦ �˾Ƴ���,
		// �װ� �̿��� �ݺ������� ����ϴµ� forEach�� ũ�⸦ �˾Ƴ� �ʿ�x
	}

}
