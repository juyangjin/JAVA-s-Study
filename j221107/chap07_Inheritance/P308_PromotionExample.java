package j221107.chap07_Inheritance;

class A{}

class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class P308_PromotionExample { //자동타입변환

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e; //상속관계가 아니므로 컴파일 에러
		//C c2 = d;

	}

}
