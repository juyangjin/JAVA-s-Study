package j220930.chap04_if_else_for;

public class P118_SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break; // break를 추가하여 시간별 누적 출력을 방지 
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
		}

	}

}
