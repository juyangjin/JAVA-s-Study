package JIN220930.Chap03_Operators;

public class P91_StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "진주양";
		String strVar2 = "진주양";
		String strVar3 = new String("진주양");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals (strVar3));	
	}
}
