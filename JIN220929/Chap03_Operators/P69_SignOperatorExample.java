package JIN220929.Chap03_Operators;

public class P69_SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
	//  short result3 = -s //부호 연산의 산출타입은 자동으로 int로 변환되기 때문에 short에 저장하면 컴파일에러가 발생
		int result3 = -s;
		System.out.println("result3=" + result3);

	}

}
