package exercise;

// ����	https://re-build.tistory.com/3
public class CallByValue {

	public static void main(String[] args){
		int a = 10;
		int b = 20;
		System.out.println("(��) a=" + a + ", b=" + b);
		swap(a,b);
		System.out.println("(��) a=" + a + ", b=" + b);
		
		System.out.println("");
	}
	
	public static void swap(int x, int y){
		int temp=x; 
		x = y;	   
		y = temp;	
	}
}








