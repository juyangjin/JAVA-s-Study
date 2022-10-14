package j221013.chap06_Class;

public class Singleton {
	private static Singleton singleton = new Singleton(); //private로 외부 접근을 제한
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singleton;
	}

}
