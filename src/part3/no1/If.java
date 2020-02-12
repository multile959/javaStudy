package part3.no1;

// 조건문
public class If {
	
	public static void main(String[] args) {

		int x = 50;
		int y = 60;
		
		if(x < y) {
			System.out.println(x + "는 " + y +"보다 작다.");
		}
		
		if(x==y) {
			System.out.println("x와 y는 같습니다.");
		}
		
		if(x < y)
			System.out.println("x와 y는 다릅니다.");
		System.out.println("test");
		
		if(x==y) {
			System.out.println("x는 y랑 같습니다.");
		}else if(x<y){
			System.out.println("x와 y는 다릅니다.");
		}else {
			System.out.println("x는 y보다 큽니다.");
		}
		
		// 가급적이면 너무 많은 if-else 구문을 쓰지않는게 좋다.
	}
}
