package part2.no4;

// 기본형의 타입변환
public class TypeCasting {
	
	public static void main(String[] args) {
		
		// byte < short, char < int < long < float < double
		// 실수는 소수점 뒷자리 까지 담을 수 있기에 실수형이 크다.
		
		// 큰 데이터 타입을 작은거에 넣으려면 오류 O
		// 반대로, 작은 거를 큰거에 넣으려면 오류 X
		
		int x1 = 50000;
		long y1 = x1;		// 묵시적 형변환
		
		long x2 = 5;
		int y2 = (int)x2;	// 강제 형변환		
		// 만약 (int) 를 쓰지않는다면 컴파일 에러가 난다. 
		// 컴파일러는 long에 담긴 값이 작은지 큰지 알수없기 때문.
		
	
	}
}
