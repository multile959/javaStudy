package part6.no1;

public class Run {

	public static void main(String[] args) {
		// no3 �����ε�
		OverloadingExam o = new OverloadingExam();
		System.out.println(o.plus(4,5));
		System.out.println(o.plus(4,5,6));
		System.out.println(o.plus("4","5"));
		
		// [no4]
		Car c1 = new Car();
		Car c2 = new Car("��������� �����ÿ����");
		Car c3 = new Car("�� ���", 1000000000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
