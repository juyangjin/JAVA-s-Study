package j221111.chap07_Inheritance;

public class P326_Child extends Parent {
	public static void  main(String args) {
		Parent parent = new P326_Child();
		parent.field1 = "data1";
		parent.method();
		
	}
}
