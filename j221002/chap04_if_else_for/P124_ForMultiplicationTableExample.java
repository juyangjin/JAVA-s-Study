package j221002.chap04_if_else_for;

public class P124_ForMultiplicationTableExample { //구구단 출력하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m=2; m<=9; m++) {
			System.out.println("\n***" + m + "단 ***");
			
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}
