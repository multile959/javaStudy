package exercise;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		String[] randomNameArr = new String[100];
		RandomNaimg Random = new RandomNaimg();
		Scanner sc = new Scanner(System.in);
		while(true) {
		
			System.out.println("���� �̸� �����");
			System.out.println("1. ��ȸ");
			System.out.println("2. ���θ����");
			
			int answer = sc.nextInt();
			
			switch(answer) {
			case 1 : if(randomNameArr != null) {
				System.out.println("--------------------------------------");
				
				// ��¹�
				for(int i = 1 ;i <= randomNameArr.length;i++) {
					System.out.print( randomNameArr[i-1] + "\t");
					if(i%5==0||i== randomNameArr.length) {
						System.out.println();
					}
				}
				
				System.out.println("--------------------------------------");
			}
			case 2 : 
				String[] arr = Random.naming();
				if(arr != null) {
					randomNameArr = arr;
				}
				break;
			
			default: return;
			}
		}
		
		
	}
}