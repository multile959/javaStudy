package part3.no4;

// switch문
public class Switch {
	// switch, case, default, break
	
	public static void main(String[] args) {
		int value = 1;
		
		switch(value) {
			case 1 : System.out.println("1"); 			break;
			case 2 : System.out.println("2"); 			break;
			case 3 : System.out.println("3"); 			break;
			default: System.out.println("그 외 다른 숫자");
		}
		// 만약 break;가 없다면 만난 case 부터 마지막줄까지 모두 출력된다
		
		String str = "A";	// JDK 7 이후부터는 문자열도 된다
		switch(str) {
			case "A" : System.out.println("A");			break;
			case "B" : System.out.println("B");			break;
			default : System.out.println("그 외 다른문자");	break;
			
		}
	}
	
}
