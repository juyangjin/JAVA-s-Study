package JIN221013.Chap06_Class;

public class Television {  // 정적 초기화 블록
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	//static(정적) 메소드와 정적 블록은 객체가 없어도 실행됨, 따라서 이들 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없고, 객체 자신의 참조인 this도 사용이 불가능함.
	
	static {
		info = company + "-" + model;
	}
}
