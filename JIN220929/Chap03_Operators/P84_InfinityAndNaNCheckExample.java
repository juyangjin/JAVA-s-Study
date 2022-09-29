package JIN220929.Chap03_Operators;

import java.util.Scanner;

public class P84_InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner와 if문을 사용하여 조금 더 유동적인 소스코드로 변경
		//실수값을 입력받을 때 소숫점을 입력했는지 여부에 따라 실수가 아니라는 조건을 걸고 싶었으나 실패함
		
		Scanner Scan = new Scanner(System.in); 
		System.out.println("정수를 실수로 나누기\n나누어질 정수를 입력해주세요:");
		int x = Scan.nextInt();
		System.out.println("나눌 실수를 입력해주세요:");
		double y = Scan.nextDouble();
			
		double z = x / y; // 정수를 실수 0.0으로 나누는 식 계산
	    //double z = x % y;
		
		if (Double.isInfinite(z)) {
			System.out.println("해당 두 값으로 계산 시 infinity가 되니, 다른 값을 입력하여주세요.");
		} else {
			System.out.println("연산결과는 " + z + "입니다.");
		}
		
		//System.out.println(z);
		//System.out.println(Double.isInfinite(z));//실수를 0.0이나 0.0f로 나누었을 때 나오는 infinity(무한대)이 출력될지 여부를 확인
		//System.out.println(Double.isNaN(z));//실수를 0.0이나 0.0f로 나누었을 때의 나오는 NaN이 출력될지 여부를 확인
		//System.out.println(z + 2); //Double.isInfinite(z)결과값이 true이고, 결과값도 Infinity로 출력됨
	
		

	}

}
