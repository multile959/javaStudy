package exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ���� �̸� ��±�
 * @author HJ
 *
 */
public class RandomNaimg {

	public String[] naming() {
		System.out.println("[���� �̸� ����� ���α׷�]");
		Scanner sc = new Scanner(System.in);
		int col = 5;

		// normal
		String[] first = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "Ȳ", "��", "��", "��", "ȫ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"};

		// Ȯ���߰� - �ѱ��� �ִټ���(��>��>��>��>������)
		String[] firstKor= {"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "Ȳ", "��", "��", "��", "ȫ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"
				, "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"};
		
		String[] middle = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "ǳ", "��", "��", "â", "õ", "ö", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ȫ", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "ȣ", "ȯ", "��", "��", "��", "��", "��", "��", "��", "��" ,"ġ", "��", "   "};

		String[] end = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "ǳ", "��", "��", "â", "õ", "ö", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ȫ", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "ȣ", "ȯ", "��", "��", "��", "��", "��", "��", "��", "��" ,"ġ", "��"};
		
		System.out.println("- �� " + (50 * (end.length+1) * end.length) + " ������ �̸��� ������ֽ��ϴ�.");
		System.out.print("* ������ ��,��,��,�ַ� ���� Ȯ���� ���ϱ��? (yes��� 1) \t");
		int answer = sc.nextInt();
		System.out.println();
		

			
			if(answer==1) {
				System.out.println("- ��>��>��>��>������ ���� Ȯ���� �̸��� ��������ϴ�.");
			}
			
			System.out.print("* ��� �̸��� ���� ������?\t");
			int count = sc.nextInt();
			
			String[] nameArr = new String[count];
			
			if (count == 0) {
				
			} else {
				System.out.println("--------------------------------------");

				
				for (int i = 1; i <= count; i++) {

					String name = "";
					
					
					// (int)(Math.random() * (�ִ밪-�ּҰ� +1)) + �ּҰ�

					int randomNum1 = (int) (Math.random() * first.length);
					int randomNum2 = (int) (Math.random() * middle.length);
					int randomNum3 = (int) (Math.random() * end.length);

					if(answer==1) {
						name += firstKor[(int)(Math.random() * firstKor.length)];
					} else{
						name += first[randomNum1];
					}
					

					boolean flag1 = middle[randomNum2].equals(first[randomNum1]);
					while (flag1) {
						randomNum2 = (int) (Math.random() * middle.length);
						flag1 = middle[randomNum2].equals(first[randomNum1]);
					}

					name += middle[randomNum2];

					boolean flag2 = end[randomNum3].equals(middle[randomNum2]);
					while (flag2) {
						randomNum3 = (int) (Math.random() * end.length);
						flag2 = end[randomNum3].equals(middle[randomNum2]);
					}

					name += end[randomNum3];
					nameArr[i-1] = name;

				}
				
				Arrays.sort(nameArr);
				
				// ��¹�
				for(int i = 1 ;i <= nameArr.length;i++) {
					System.out.print(nameArr[i-1] + "\t");
					if(i%col==0||i==nameArr.length) {
						System.out.println();
					}
				}
				
				System.out.println("--------------------------------------");
				System.out.println("�����ұ��?");
				String storeAnswer = sc.next();
				if(storeAnswer.equals("Y")) {
					return nameArr;
							
				}else {
					return null;
				}
				
			
		}
			return null;

	}

}
