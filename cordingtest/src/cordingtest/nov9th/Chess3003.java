package cordingtest.nov9th;

import java.util.Scanner;

public class Chess3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 체스 말의 정해진 갯수
		int King = 1;
		int Queen = 1;
		int Rooks = 2;
		int Bishops = 2;
		int Knights = 2;
		int Pawns = 8;
		
		// 장기 말 갯수 - 사용자 입력값
		King = King - sc.nextInt();
		Queen = Queen - sc.nextInt();
		Rooks = Rooks - sc.nextInt();
		Bishops = Bishops - sc.nextInt();
		Knights = Knights - sc.nextInt();
		Pawns = Pawns - sc.nextInt();
		sc.close();
		
		// 출력값
		System.out.print(King + " ");
		System.out.print(Queen + " ");
		System.out.print(Rooks + " ");
		System.out.print(Bishops + " ");
		System.out.print(Knights + " ");
		System.out.print(Pawns + " ");
		
	}
}
