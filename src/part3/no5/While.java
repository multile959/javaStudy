package part3.no5;

// while 문
public class While {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {	// false가 있을 때까지 반복됨
			System.out.println(i++);
//			i++;		// i+=1;
		}
		
		
		// (ex) 1 부터 100 까지 모두 더하기
		int sum = 0;
		int num = 1;
		while(num<=100) {
			sum += num++;
		}
		
		System.out.println(sum);
		
	
	}
}
