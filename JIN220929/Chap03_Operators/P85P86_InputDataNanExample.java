package JIN220929.Chap03_Operators;

import java.util.Scanner;

public class P85P86_InputDataNanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요:");
		String userInput = Scan.nextLine(); //사용자로부터 입력받은 값, 악의성 있는 사용자는 변환이 안되는 NaN을 입력할지도 모른다.
		double val = Double.valueOf(userInput); //입력받은 값을 double 형으로 변환
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) { //NaN입력 시 예외처리
			System.out.println("예외발생, NaN이 입력되었으므로 처리할 수 없습니다.");
			val = 0.0;  //NaN값이 들어간 val값을 0.0으로 초기화
		} else {
			currentBalance += val;
			System.out.println("10000.0 + "+ val + "은 =" + currentBalance + "입니다.");
		}
	}
}
