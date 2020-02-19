package part6.no1;

public class Car {
	String name;
	int price;
	
	// [no1]   기본 생성자와 매개변수 생성자
	// 매개변수생성자만 쓰면 반드시 값을 넣은채로 인스턴스 생성해야한다.
/*    public Car(String n){
 *        name = n;
 *    }
 */	
	// [no2]    this 사용
	public Car(String name) {
		this.name = name;	// this - 현재 객체, 자기자신
	}
	
	// [no4]    기본생성자 (디폴트, 아무값도 받지않는 생성자)
	public Car() {
		this("이름없음", 0); // 자기자신의 생성자를 호출 -> 중복을 방지
	}
	
	//	     	매개변수생성자
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// * Override하지않으면 주소값을 출력하기에 toString을 오버라이드해줌.
	@Override
	public String toString() {
		return "자동차 (이름: "+name +", 가격: "+ price + ")";
		
	}
}
