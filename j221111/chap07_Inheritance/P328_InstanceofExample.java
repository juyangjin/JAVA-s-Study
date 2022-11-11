package j221111.chap07_Inheritance;

public class P328_InstanceofExample {
	
	public static void method1(Parent2 parent) {
		if(parent instanceof Child2) { //Child2 타입으로 변환가능한지 확인
			Child2 child = (Child2) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.printlnI("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent2 parent) {
		Child2 child = (Child2) parent; //ClassCastException이 발새할 가능성이 있음.
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(parentA);
		method2(parentA);
		
		Parent2 parentB = new Parent2();
		method
	}

}
