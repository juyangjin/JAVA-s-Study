package j221002.chap04_if_else_for;

public class P122_ForSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100 합:" + sum);
	}
}
