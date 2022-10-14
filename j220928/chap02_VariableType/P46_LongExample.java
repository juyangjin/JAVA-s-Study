package j220928.chap02_VariableType;

public class P46_LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 10;
		long var2 = 20L;
	  //long var3 = 1000000000000; //intType에서 범위를 넘어서는 값을 입력하여 컴파일 에러발생, 단 L을 입력하면 long 타입 변수로 저장가능
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
