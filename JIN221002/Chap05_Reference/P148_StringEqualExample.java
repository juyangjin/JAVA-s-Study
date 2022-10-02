package JIN221002.Chap05_Reference;

public class P148_StringEqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "진주양";
		String strVar2 = "진주양";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVarl과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("진주양");
		String strVar4 = new String("진주양");

		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
