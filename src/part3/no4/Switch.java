package part3.no4;

// switch��
public class Switch {
	// switch, case, default, break
	
	public static void main(String[] args) {
		int value = 1;
		
		switch(value) {
			case 1 : System.out.println("1"); 			break;
			case 2 : System.out.println("2"); 			break;
			case 3 : System.out.println("3"); 			break;
			default: System.out.println("�� �� �ٸ� ����");
		}
		// ���� break;�� ���ٸ� ���� case ���� �������ٱ��� ��� ��µȴ�
		
		String str = "A";	// JDK 7 ���ĺ��ʹ� ���ڿ��� �ȴ�
		switch(str) {
			case "A" : System.out.println("A");			break;
			case "B" : System.out.println("B");			break;
			default : System.out.println("�� �� �ٸ�����");	break;
			
		}
	}
	
}
