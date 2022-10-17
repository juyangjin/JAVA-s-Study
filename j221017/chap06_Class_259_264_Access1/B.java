package j221017.chap06_Class_259_264_Access1;

public class B {
//		//p259 클래스의 접근제한
//		A a; // A가 선언된 클래스 접근가능
//		
//		//p261 생성자의 접근제한
//		//필드
//		A a1 = new A(true); //ok
//		A a2 = new A(1); //ok
//		//A a3 = new A("문자열"); // A 클래스에서 private 생성자로 선언하여 접근불가.
//		
		//p263 필드와 메소드의 접근제한
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; //private 필드 접근 불가
		
		a.method1();
		a.method2();
//		a.method3(); //private 메소드 접근 불가(컴파일 에러)
	}
}
