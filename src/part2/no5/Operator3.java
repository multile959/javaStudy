package part2.no5;

// 연산자 우선순위
public class Operator3 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c);
		// 5 - 10 * 15 = 5 - 150 = -145
		
		System.out.println((a-b)*c);
		// (5-10)*15 = -5 * 15 = -75
		
		System.out.println(a > 5 && b > 5);
		// false && true = false
		
		System.out.println(a > 5 || b > 5);
		// false || true = true
		
		System.out.println(++a - 5);
		// 6 - 5 = 1		(a = 6)
		
		System.out.println(a++ - 5);
		// 6 - 5 = 1		(a = 7)
		

		//---------------------------------
		int a1 = 10;				// a= 10
		int b1 = 10 / 2;			// b= 5
		int c1 = a1++;				// c= 10, a=11
		int d1 = c1+ --b1;			// d= 10+4 = 14, b=4
		int e1 = ++a1 + c1 * d1;	// e= 12 + 14 * 10 = 152, a=12
		
		// 따라서 a= 12, b=4, c=10, d=14, e=152
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
	}

}
