package part4.no4;

public class ForEach {
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		System.out.print("for문 사용 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
		System.out.print("\n"+"for each문 사용 : ");
		for(int num : arr) {
			System.out.print(num +" ");
		}
		
		
		// for문을 쓰려면 배열&자료구조의 크기를 알아내고,
		// 그걸 이용해 반복문으로 써야하는데 forEach는 크기를 알아낼 필요x
	}

}
