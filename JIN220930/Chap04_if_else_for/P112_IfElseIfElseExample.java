package JIN220930.Chap04_if_else_for;

import java.util.Scanner;

public class P112_IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("성적을 입력해주세요:");
		int score = Scan.nextInt();
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A 입니다.");
			
		} else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B 입니다.");
			
		} else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C 입니다.");
			
		} else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}
}
