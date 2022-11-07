package j221107.chap07_Inheritance_P303Protected2;

import j221107.chap07_Inheritance_P303Protected.A;

public class C {
	public void method() { //C클래스와 A클래스가 다른 패키지에 있으므로 protected필드, 생성자, 메소드에 접근이 불가능하다
//		A a = new A(); //x
//		a.field = "value"; //x
//		a.method(); // x
	}

}
