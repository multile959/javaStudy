package part4.no3;

public class Array2dimension {
	public static void main(String[] args) {
		int[][] array1 = new int[3][4];
		array1[0][1] = 3;
		
		int[][] array2 = new int[3][];
		array2[0] = new int[1]; 		// 0��° �ε����� ����Ű���ִ� �κ��̾�� nullpoint�� ���
		array2[0][0] = 3;
		
		int[][] array3 = {{0},{1,2,3},{4,8,12}};
		
		System.out.println(array3[0][1]);
		
		// 3����, 4����, 5���� �迭�� ��������.
		
	}
}
