package j221002.chap04_if_else_for;

public class P132_BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
