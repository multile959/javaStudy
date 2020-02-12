package part3.no7;

// for문
public class For {
	public static void main(String[] args) {
		
		// 1 부터 100까지 합
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			// * 1 부터 100까지 수 중에 2의 배수 만 출력시키려면..
//			if(i % 2 != 0) {
//				continue;	// 만나면 아래를 실행하지않고 바로 다음실행되는 i++로 바로 올라감		
//			}
		
			total +=i;
			
			// * 1 부터 50까지만 더하고 싶다면..
			if(i == 50) {
				break;		// 만난지점에서 바로 빠져나오게함			
			}
		}
		
		System.out.println(total);

		// continue랑 break는 while, do-while에서도 사용할 수 있다
		
		
	}
}
