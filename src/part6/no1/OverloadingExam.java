package part6.no1;

// [no3]
public class OverloadingExam {

	public int plus(int x, int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public String plus(String x, String y) {	// �Ű�����Ÿ�԰� ������ �Ȱ����� �ȵ�
		return x + y;
	}
}
