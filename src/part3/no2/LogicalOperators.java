package part3.no2;

import java.util.Scanner;

// 논리 연산자
public class LogicalOperators {
	
	// &&	(논리곱) 		모두 true일때만 true		: and
	// ||	(논리합) 		둘중 하나만 true여도 true : or
	// !	(논리부정) 	결과를 반대로			: not
	// ^	(배타적 논리합) 	하나는 true고 하나는 false일때만 true를 리턴	: xor
	
	public static void main(String[] args) {
		boolean t1 = true;
		boolean f1 = false;
		boolean t2 = true;

		
		System.out.println(t1 && f1);	// false
		System.out.println(t1 && t2);	// true
		System.out.println(t1 || f1); 	// true
		System.out.println(f1 || false);	// false
		
		// (ex) 입력을 받은 값이 100 ~ 70 : 성공, 이외엔 실패
		int score = 88;
		if(score <= 100 && score >= 70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		System.out.println(t1 ^ t2);	// false
		System.out.println(t1 ^ f1);	// true
		
		System.out.println(!t1);		// false
		
		
		// ----------------------------------------
		// (PLUS+) 콘솔창 입력은 어떻게 했더라?
		
		Scanner sc =new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		
		System.out.println("\n반갑습니다, "+ name+ "님!");
		
		
	
	}
	
}
