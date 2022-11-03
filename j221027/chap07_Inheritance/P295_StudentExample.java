package j221027.chap07_Inheritance;

public class P295_StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("student : " +
						    student.studentNo);
	}
}
