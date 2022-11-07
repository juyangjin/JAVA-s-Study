package j221107.chap07_Inheritance_P303Protected;

public class B { //B 클래스는 A클래스와 같은 패키지에 있으므로 protected필드, 생성자, 메소드에 얼마든지 접근이 가능하다.
	public void method() { 
		A a = new A(); //o
		a.field = "value"; //o
		a.method(); //o
	}

}
