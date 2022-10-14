package j220929.chap03_Operators;

import java.util.Scanner;

public class P78_ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연산을 시작합니다.\n첫번째 값을 입력해주세요:");
		int v1 = scan.nextInt();
		
		System.out.println("두번째 값을 입력해주세요:");
		int v2 = scan.nextInt();
		
		int result1 = v1 + v2;
		System.out.println("두 값을 더한 result=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("두 값을 뺀  result=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("두 값을 곱한 result=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("두 값을 나눈 result=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("두 값을 나눈 result의 나머지값=" + result5);
		
		double result6 = (double) v1 / v2; //실수형으로 강제형변환
		System.out.println("두 값을 소숫점까지 나눈 result=" + result6);

	}

}
