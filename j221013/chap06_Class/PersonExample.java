package j221013.chap06_Class;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-123457","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name ="을지문덕"; //final 필드는 값 수정이 불가능하기 때문에 Person 클래스에서 생성된 ssn,nation 필드는 수정이 불가능
	}
}
