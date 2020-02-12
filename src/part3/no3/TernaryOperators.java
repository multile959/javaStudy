package part3.no3;

// 삼항 연산자
public class TernaryOperators {
	public static void main(String[] args) {
		int b1 = (5 < 4) ? 50 : 40;
		
		System.out.println(b1);
		
		// if-else랑 같은 역할을 한다
		
		int b2;
		if(5 < 4) {
			b2 = 50;
		}else {
			b2 = 40;
		}
		
		System.out.println(b2);

		// 삼항연산자를 적절히 사용하면 편하다.
	}
}
