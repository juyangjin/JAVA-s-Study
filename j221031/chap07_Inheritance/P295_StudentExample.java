package j221031.chap07_Inheritance;

public class P295_StudentExample {//자식객체이용

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("홍길동","123456-1234567",1);
		System.out.println("name: " + student.name); //부모에게서 물려받은 필드 출력
		System.out.println("ssn: " + student.ssn); //부모에게서 물려받은 필드 출력
		System.out.println("studentNo : " + student.studentNo);
	}

}
