package part4.no2;

public class UsingArray {
	public static void main(String[] args) {
		
		int[] arr = new int[100];
		arr[0] = 1;
		arr[1] = 2;
	
		// 100짜리 크기의 배열에 1부터 100까지 차례대로 넣기
		
		for(int i = 0 ; i< arr.length; i++) {
			arr[i] = i+1;
		}
		
		/*
		// 확인용
		for(int num : arr) {
			System.out.print(num+"\t");
			
			if(num%10==0)
				System.out.println();
		}
		*/
		
		/* 선언한 지점에 따라 변수를 사용할 수있는 영역(scope)이 달라진다
		 * 변수는 한 블럭이 끝나면 소멸된다.
		 * (for문 돌릴때 int i 를 쓰는데 다른 for문에서도 int i 를 썻을때 문제없었던 이유)
		 */
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		
	}
}
