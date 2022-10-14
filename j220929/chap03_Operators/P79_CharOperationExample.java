package j220929.chap03_Operators;

public class P79_CharOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A' + 1; // A를 intType으로 하면 숫자 65가 되어 c1에는 int형 66이 저장된다.
		char c2 = 'A'; 
	//  char c3 = c2 + 1; // 그러나 앞서 intType이 된 c2를 charType인 c3에는 대입할수 없기 때문에 에러가 발생한다.
		
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
	//  System.out.println("c3:" + c3);
	}

}
