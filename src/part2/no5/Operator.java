package part2.no5;

// 연산자와 연산식
public class Operator {
	public static void main(String[] args) {
		/*
		 * [연산]
		 * 데이터를 처리하여 결과를 산출
		 * 
		 * (ex) x = y + z;	 -->  y와 z를 더한값을 x에 대입한다.
		 * 
		 * 연산자(Operations) : 연산에 사용되는 표시나 기호
		 * 피연산자(Operand) : 연산 대상이 되는 데이터(리터럴, 변수)
		 * 연산식 (Expressions) : 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것
		 *
		 *---------------------------------------------------------
		 */
		// [연산자]
		// (1) 부호 연산자 : + -		=> 단항 연산자
		// 변수에 에 부호연산자가 붙으면 
		// +는 그대로 유지
		// -는 음수는 양수로, 양수는 음수로 변경하는 역할
		
		int i1 = -5;	// -5
		int i2 = +i1;	// -5
		int i3 = -i1;	// 5
		
		// (2) 증감 연산자 : ++ --	=> 단항 연산자
		// * 전위
		int i4 = ++i3; // 5+1 = 6
		System.out.println(i4);// i3 = 6	
		System.out.println(i3);
		
		// * 후위
		int i5 = i3++; // 6
		System.out.println(i5); // i3 = 7   
		System.out.println(i3);
	
		// (3) 산술 연산자 : + - * / %(모듈러 연산, 나눈 나머지값)
		int i = 5;
		int j = 2;
		
		System.out.println(i+j);		// 7
		System.out.println(i-j);		// 3
		System.out.println(i*j);		// 10
		System.out.println(i/j);		// 2 	-->정수끼리의 연산은 정수형으로 리턴됨
		System.out.println(i/(double)j);	// 2.5		(캐스팅연산)
		System.out.println(i%j);		// 3
	}
}
