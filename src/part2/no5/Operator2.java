package part2.no5;

// 비교연산자
public class Operator2 {
	public static void main(String[] args) {
		// ==	 !=		 <	  >	  <=	  >=
		//같다	다르다	크다	 작다	크거나같다	작거나같다
		
		// 비교연산자의 결과는 boolean 값이다.
		// * = 는 단순대입연산자
		int i = 10;	
		int j = 10;
		
		System.out.println(i == j);		// true
		System.out.println(i != j);		// false
		System.out.println(i < j);		// false
		System.out.println(i <= j); 	// true
		System.out.println(i > j); 		// false
		System.out.println(i >= j); 	// true
		
		// * 복합대입연산자
		i += 10;	// i = i + 10;
		i -= 10;	// i = i - 10;
		i /= 2;		// i = i / 2;
		i *= 2;		// i = i * 2;
		i %= 10;	// i = i % 10;
		System.out.println(i);	// 0
	}
}
