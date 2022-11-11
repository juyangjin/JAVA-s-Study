package j221107.chap07_Inheritance;

import j221111.chap07_Inheritance.Parent;

public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("Child-method2()"); //재정의
	}

}
