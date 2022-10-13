package j221002.chap04_if_else_for;

public class P131_BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			int num = (int)(Math.random()*6) +1; //1부터 6까지 랜덤값을 받는다.
			System.out.println(num);
			
			if(num == 6) { //num값이 6이 되면 while문 종료
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}