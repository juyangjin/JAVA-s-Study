package JIN220928.P2variableType;

public class P54_1_CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032; 
		char charValue = (char) intValue; //intType을 강제로 charType으로 형변환
		System.out.println(charValue);//결과적으로 charValue는 char 형태가 되었으므로 유니코드 44032에 해당하는 문자 '가'가 출력됨
		
		long longValue = 500;
		intValue = (int) longValue; //longType을 강제로 intType으로 형변환함
		System.out.println(intValue);//long과 int는 둘다 정수이므로 결과값은 변화가 없지만 longType이 출력된 것
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //doubleType을 강제로 intType으로 형변환함
		System.out.println(intValue); //doubleType(실수형)이 아닌 소숫점이 생략된 intType(정수형)이 출력됨
	
	}

}
