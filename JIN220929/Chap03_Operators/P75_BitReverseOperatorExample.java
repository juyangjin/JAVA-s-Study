package JIN220929.Chap03_Operators;

public class P75_BitReverseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 10;
		int v2 = ~v1; //~는 비트반전 연산자로, 피연산자가 0일때 1로, 1일때 0으로 반전해주어 새로운 결과값을 내게 한다.(2진수)
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + "(십진수" + v1 + ")");
		System.out.println(toBinaryString(v2) + "(십진수" + v2 + ")");
		System.out.println(toBinaryString(v3) + "(십진수" + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4; 
		int v6 = ~v4 + 1;
		
		System.out.println(toBinaryString(v4) + "(십진수" + v4 + ")");
		System.out.println(toBinaryString(v5) + "(십진수" + v5 + ")");
		System.out.println(toBinaryString(v6) + "(십진수" + v6 + ")");
	}

	private static String toBinaryString(int value) {
		// TODO Auto-generated method stub
		String str = Integer.toBinaryString(value);//Integer.toBinaryString()메소드는 앞의 비트가 모두 0일 때 0이 생략되고 나머지 문자열만 리턴한다. 
		while(str.length() < 32) { //그러므로 리턴하는 str 문자 수를 조사해서 32보다 작으면 앞에 0을 붙이도록 한 것이다.
			str = "0" + str;
		}
		return str;
	}

}
