package part6.com.java.study;

import part6.no1.*;

public class Run {
	public static void main(String[] args) {
		Car c1 = new Car();		// ctrl + shift + o
		Car c2 = new Car("¹«½î",30000000);		// ctrl + shift + o
		OverloadingExam o = new OverloadingExam();
		
		System.out.println(o.plus(1,2));
	}
}
