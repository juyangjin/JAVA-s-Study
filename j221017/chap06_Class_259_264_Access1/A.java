package j221017.chap06_Class_259_264_Access1;

//	//p259 클래스의 접근제한
//public class A {}//아무것도 기입하지 않으면 default로 접근제한이 된다.

public class A {
//	//p261 생성자의 접근제한
//	//필드
//	A a1 = new A(true);
//	A a2 = new A(1);
//	A a3 = new A("문자열");
//	
//	//생성자
//	public A(boolean b) {} //public 접근제한 (사실상 접근제한이 아님)
//	A(int b) {} //default 접근제한
//	private A(String s) {} //private 접근제한
	
	//p263 필드와 메소드의 접근제한
	//필드
	public int field1; //public 접근제한
	int field2; //default 접근제한
	private int field3; //private 접근제한
	
	//생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//메소드
	public void method1() {} //public 접근제한
	void method2() {} 		 //default 접근제한
	private void method3() {}//private 접근제한
	
}