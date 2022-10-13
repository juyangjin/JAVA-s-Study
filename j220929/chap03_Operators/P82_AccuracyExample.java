package j220929.chap03_Operators;

public class P82_AccuracyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1; //float나 double 등은 부동소수점을 가진 타입이기 때문에, 0.1을 정확히 표현할 수 없어 근사치로 처리함
		int number = 7;
		
		double result = apple - number*pieceUnit; //부동소수점의 근사치 값으로 인해 정확하지 못한 값이 연산됨
		
		System.out.println("------------수정전 결과값-----------------");
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다."); //결과적으로 정확한 0.3이 아닌 0.29999~가 남는다고 출력됨
		System.out.println("------------수정한 결과값-----------------");
		
		int apple1 = 1;
		
		int totalPieces = apple * 10;
		int number1 = 7;
		int temp = totalPieces - number1;
		
		double result1 = temp/10.0;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result1 + "조각이 남는다.");
	}
}
