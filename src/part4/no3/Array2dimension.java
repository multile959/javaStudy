package part4.no3;

public class Array2dimension {
	public static void main(String[] args) {
		int[][] array1 = new int[3][4];
		array1[0][1] = 3;
		
		int[][] array2 = new int[3][];
		array2[0] = new int[1]; 		// 0번째 인덱스엔 가리키고있는 부분이없어서 nullpoint가 뜬다
		array2[0][0] = 3;
		
		int[][] array3 = {{0},{1,2,3},{4,8,12}};
		
		System.out.println(array3[0][1]);
		
		// 3차원, 4차원, 5차원 배열도 마찬가지.
		
	}
}
