package j221111.chap07_Inheritance;

public class P326_ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 parent.field2 = "data2"; //불가능
		 parent.method3; //불가능
		 */
		
		Child child = (Child) parent; //Child로 강제타입변환
		child.field2 = "yyy"; //가능
		child.method3(); //가능
	}

}
