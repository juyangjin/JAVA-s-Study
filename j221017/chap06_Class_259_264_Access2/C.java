package j221017.chap06_Class_259_264_Access2;

import j221017.chap06_Class_259_264_Access1.*;

public class C {
//	//p259 클래스의 접근제한
//	//A a; //A클래스에서는 default로 인해 접근 제한이 되어있어서 컴파일 에러가 발생한다.
//	B b;
//	
//	//p261 생성자의 접근제한
//	//필드
//	A a1 = new A(true);
////	A a2 = new A(1); //default 생성자 접근불가
////	A a3 = new A("문자열"); //private 생성자 접근불가
//
	//p264 필드와 메소드의 접근제한
	public C() {
		A a = new A();
		a.field1 = 1; 
//		a.field2 = 1; // default 필드 접근불가
//		a.field3 = 1; // private 필드 접근불가
		
		a.method1();
//		a.method2(); // default 메소드 접근불가
//		a.method3(); // private 메소드 접근불가
	}
}
