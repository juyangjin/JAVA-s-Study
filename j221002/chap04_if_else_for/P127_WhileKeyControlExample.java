package j221002.chap04_if_else_for;

import java.io.IOException;

public class P127_WhileKeyControlExample {

	public static void main(String[] args) throws Exception {//키보드 while문 제어
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0; //키보드 제어
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {//Enter키가 입력되면 캐리지 리턴(13), 라인피드(10)가 입력되므로 둘을 제외시킨다.
				System.out.println("-------------------");
				System.out.println("1.증속 | 2.증속 | 3.중지");
				System.out.println("-------------------");
				System.out.println("선택: ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) { //1를 읽었을 경우
				speed++;
				System.out.println("현재 속도=" + speed);
				
			} else if (keyCode == 50) { //2를 읽었을 경우
				speed--;
				System.out.println("현재 속도=" + speed);	
				
			} else if (keyCode == 51) { //3을 읽었을 경우
				run = false;
				
				}
			}
		System.out.println("프로그램 종료");
	}
}
