package cordingtest.conditionalstatement;

import java.util.Scanner;

public class Cs_14681 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();
		
		if(a>0) {
			if(b>0) {
				System.out.println("1");
			}
			else {
				System.out.println("4");
			}
		}
		else {
			if(b>0) {
				System.out.println("2");
			}
			else {
				System.out.println("3");
			}
		}
	}

}
