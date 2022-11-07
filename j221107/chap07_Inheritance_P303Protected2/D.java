package j221107.chap07_Inheritance_P303Protected2;

import j221107.chap07_Inheritance_P303Protected.A;

public class D extends A{ 
	//C클래스와 달리 D클래스는 A의 자식 클래스이므로 A클래스의 protected필드, 생성자, 메소드에 접근이 가능하다.
	//단, new 연산자로 직접호출 하는 것이 아닌 자식생성자에서 super()로 A 생성자를 호출 할 수 있다.
	 public D() {
		 super(); //o
		 this.field = "vlaue"; //o
		 this.method(); //o
		 
	 }

}
