package cordingtest.conditionalstatement;

import java.util.Scanner;

public class Cs_2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); //시
		int M  = sc.nextInt(); //분
		
		sc.close();
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}

}
