package part3.no1;

// ���ǹ�
public class If {
	
	public static void main(String[] args) {

		int x = 50;
		int y = 60;
		
		if(x < y) {
			System.out.println(x + "�� " + y +"���� �۴�.");
		}
		
		if(x==y) {
			System.out.println("x�� y�� �����ϴ�.");
		}
		
		if(x < y)
			System.out.println("x�� y�� �ٸ��ϴ�.");
		System.out.println("test");
		
		if(x==y) {
			System.out.println("x�� y�� �����ϴ�.");
		}else if(x<y){
			System.out.println("x�� y�� �ٸ��ϴ�.");
		}else {
			System.out.println("x�� y���� Ů�ϴ�.");
		}
		
		// �������̸� �ʹ� ���� if-else ������ �����ʴ°� ����.
	}
}
