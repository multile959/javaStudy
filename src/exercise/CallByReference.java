package exercise;

// ���� 	https://re-build.tistory.com/3
public class CallByReference {
	
	int value;

	public CallByReference(int value) {
		this.value = value;
	}

	public static void swap(CallByReference x, CallByReference y) {
		int temp = x.value;
		x.value = y.value;
		y.value = temp;

	}

	public static void main(String[] args) {
		CallByReference a = new CallByReference(10);	//{value:10}
		CallByReference b = new CallByReference(20);	//{value:20}
		System.out.println("(��) a = " + a.value + ", b = " + b.value);
		swap(a, b);
		System.out.println("(��) a = " + a.value + ", b = " + b.value);

	}
	
}







