package j220929.chap03_Operators;

import java.util.Scanner;

public class P81_CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("덧셈연산 전 예외처리를 위한 확인을 진행합니다.\n첫번째 숫자를 입력해주세요:");
		int left = Scan.nextInt();
		System.out.println("두번째 숫자를 입력해주세요:");
		int right = Scan.nextInt();
		
		try {
			int result = safeAdd(left,right); //safeAdd()메소드는 산술연산 전에 두 개의 매개값의 범위를 조사하여 오버플로우 발생위험이 있으면 예외처리한다. 
			System.out.println("두 수의 합은:" + result); //예외가 발생하지 않았다면 return에서 받은 값이 출력됨
		} catch(ArithmeticException e) { //예외발생시
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음"); 
		}
	}

	private static int safeAdd(int left, int right) { //intType으로 위에 있는 두 개의 매개값을 각각 left, right에 저장
		// TODO Auto-generated method stub
		
		if((right>0)){ //right값이 양수일 때 실행
			
			if(left>(Integer.MAX_VALUE - right)) {//정수의 최댓값에서 right값 뺀 것 보다 left 값이 커버리면 덧셈연산에서 정수값의 범위를 초과하여 오버플로우가 발생하므로 예외처리 
				throw new ArithmeticException("오버플로우 발생"); 
			}
		} else { //right값이 음수일 때 실행
			if(left<(Integer.MIN_VALUE - right)) {//정수의 최솟값에서 음수인 right값을 뺀 것 보다 left 값이 작으면 덧셈연산에서 정수값의 범위를 초과하여 오버플로우가 발생하므로 예외처리
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right; //return으로 두 수를 더하기 때문에 그것을 가정하여 예외처리를 작성
	}

}
