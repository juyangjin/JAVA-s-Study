package j221107.chap07_Inheritance;

public class P311_ChildExample { //자동 타입 변환 후의 멤버 접근

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Child parent = child; //자동타입변환
		parent.method1();
		parent.method2(); //재정의된 메소드가 호출됨
	//	parent.method3(); //호출불가

	}

}
