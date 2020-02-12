package part2.no1;

// 변수
public class Variable {

	public static void main(String[] args) {

		/*
		 * [강형언어] 모든 변수타입이 컴파일시 결정되는 언어. 
		 * 어떤 데이터를 담을것인지 선언할때 지정 (알맞은 타입만 가능)
		 */
		
		int count; // 타입형 식별자;
		
		count = 10;
		count = 20;	// 마지막에 담긴 값으로 지정됨. (이전 값은 사라진다)
		
//		count = 11.1;	// int 형에 실수값을 담을 수 없다.
		double avg = 11.1;
		
		String name = "hyeonj";
		
		// 변수는 첫번째 문자를 항상 소문자.
		// 긴 변수명을 쓴다면 낙타 표기법
		// int totalcount;			// 가독성이 구리다!
		int totalCount;
		
	}
}
