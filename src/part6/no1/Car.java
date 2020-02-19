package part6.no1;

public class Car {
	String name;
	int price;
	
	// [no1]   �⺻ �����ڿ� �Ű����� ������
	// �Ű����������ڸ� ���� �ݵ�� ���� ����ä�� �ν��Ͻ� �����ؾ��Ѵ�.
/*    public Car(String n){
 *        name = n;
 *    }
 */	
	// [no2]    this ���
	public Car(String name) {
		this.name = name;	// this - ���� ��ü, �ڱ��ڽ�
	}
	
	// [no4]    �⺻������ (����Ʈ, �ƹ����� �����ʴ� ������)
	public Car() {
		this("�̸�����", 0); // �ڱ��ڽ��� �����ڸ� ȣ�� -> �ߺ��� ����
	}
	
	//	     	�Ű�����������
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// * Override���������� �ּҰ��� ����ϱ⿡ toString�� �������̵�����.
	@Override
	public String toString() {
		return "�ڵ��� (�̸�: "+name +", ����: "+ price + ")";
		
	}
}
