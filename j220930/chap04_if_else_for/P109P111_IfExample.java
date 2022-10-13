package j220930.chap04_if_else_for;

import java.util.Scanner;

public class P109P111_IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요:");
		int score = Scan.nextInt();
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}	
//		if(score<90) {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B 입니다.");
//		}
		else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 이하입니다.");
		}
	}
}
