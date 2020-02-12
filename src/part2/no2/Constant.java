package part2.no2;

// 상수
public class Constant {

	public static void main(String[] args) {
		// 상수 = 수식에서 변하지않는 값
		int i;
		i = 10;
		i = 20;
		

		final int J = 100;	// 상수는 대문자 명명규칙을 사용한다.
//		J = 200;			// 값을 변경하려하면 컴파일 에러가 뜬다.
		
		// * 원의 넓이 구하기
		double circleArea;
//		circleArea = 3 * 3 * 3.14159;
		// 잘못 쓸 수 있는 원주율을 final로 선언
		final double PI = 3.14158;
		circleArea = 3 * 3 * PI;
		
		// * 기름값 구하기
		final int OIL_PRICE=1450;	// 상수는 언더바로 구분!
		int totalPrice = 50 * OIL_PRICE;
		
		
	}
}
