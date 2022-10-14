package j220929.chap02_VariableType;

public class P58_OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
	//  byte byteValue3 = byteValue1 + byteValue2;//byteType(1byte)의 경우 그것보다 큰 intType(4byte)으로 형변환 되어 결과값이 산출되므로 byteType끼리의 연산이라도 byteType에 저장되지 않고 에러가 발생.
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
	//  char charValue2 = charValue1 + charValue2; // byteType과 마찬가지로 charType도 int 보다 작은 2byte 이므로 int로 자동형변환 되어 컴파일 에러발생
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드:" + intValue2);
		System.out.println("출력문자:" + (char)intValue2); //charType으로 강제변환 후 출력
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
	  //int intValue6 = 10 / 4.0; //위와 같은 이유로 int(4byte)보다 큰 double(8byte) 형변환하여 연산되어야 하는데 그렇지 않아서 컴파일 에러 발생.
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	
	}

}
