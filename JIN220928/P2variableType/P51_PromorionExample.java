package JIN220928.P2variableType;

public class P51_PromorionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //int <- byte 형변환
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; //int <- char 형변환
		System.out.println("가의 유니코드 =" + intValue);
		
		intValue = 500;
		long longValue = intValue; //long <- int 형변환
		System.out.println(longValue); 
		
		intValue = 200;
		double doubleValue = intValue; //double <- int 형변환
		System.out.println(doubleValue); 
		
	}

}
