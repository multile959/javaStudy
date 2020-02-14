package part4.exam;

public class Run {
	public static void main(String[] args) {
	
		// 별찍기 문제 1
		
		//  *   
		// *** 
		//*****
		// ***
		//  *
		
		for(int i =0; i<5; i++) {
			
			//순서> 공백    별
			//0 -> 2   1
			//1 -> 1   3
			//2 -> 0   5
			//3 -> 1   3
			//4 -> 2   1
			
			for(int j =0; j < Math.abs(2-i); j++) {
				System.out.print(" ");
			}
			if(i<3) {
				for(int k = 0; k < (i*2)+1; k++) {
					System.out.print("*");
				}
			}else if(i==3){
				for(int k = 0; k<i; k++) {
					System.out.print("*");
				}
			}else {
				for(int k = 0; k<i-3; k++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println();
		
		// 별찍기 문제2
		
		// *************
		// *           *
		// *           *
		// *           *
		// *************
		
		for(int i = 0; i< 5; i++) {
			if(i==0 || i==4) {
				for(int j =0; j<13; j++) {
					System.out.print("*");
					
				}
				System.out.println();
			}else {
				System.out.print("*");
				for(int j = 0; j<11; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}
}
