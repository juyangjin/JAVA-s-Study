package j221110.chap07_Inheritance_P315Car;

public class Tire {
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() { //정상회전
		++accumulatedRotation; //누적 회전수 1증가 
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명: " +
		(maxRotation-accumulatedRotation) + "회");
			return true; 
		} else { //타이어펑크 시
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
