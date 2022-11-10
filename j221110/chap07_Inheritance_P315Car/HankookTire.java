package j221110.chap07_Inheritance_P315Car;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
		//출력 내용을 달리하기 위해 재정의(오버라이딩)한 roll 메소드
		@Override
		public boolean roll() { //정상회전
			++accumulatedRotation; //누적 회전수 1증가 
			if(accumulatedRotation<maxRotation) {
				System.out.println(location + "HankookTire 수명: " +
			(maxRotation-accumulatedRotation) + "회");
				return true; 
				} else { //타이어펑크 시
					System.out.println("*** " + location + "HankookTire 펑크 ***");
					return false;
				}
		}
}
