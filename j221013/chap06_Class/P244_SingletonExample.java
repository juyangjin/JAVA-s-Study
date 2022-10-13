package j221013.chap06_Class;

public class P244_SingletonExample { 
	//싱글톤은 전체 프로그램에서 단 하나의 객체만 만들도록 하는 것
	//클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 만들어야한다. (생성자만큼 객체가 생성되기 때문)
	//이 문제는 생성자를 외부에서 호출 못하도록 생성자 앞에 private 접근제한자를 붙여주면 된다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Singleton obj1 = new Singleton(); //컴파일 에러 private로 접근제한을 두었기 때문에 new를 사용할 수 없음.
		 Singleton obj2 = new Singleton(); //컴파일 에러
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}

	}

}
