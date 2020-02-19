package part6.no1;

public class Run {

	public static void main(String[] args) {
		// no3 오버로딩
		OverloadingExam o = new OverloadingExam();
		System.out.println(o.plus(4,5));
		System.out.println(o.plus(4,5,6));
		System.out.println(o.plus("4","5"));
		
		// [no4]
		Car c1 = new Car();
		Car c2 = new Car("람보르기니 무르시엘라고");
		Car c3 = new Car("라 페라리", 1000000000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
