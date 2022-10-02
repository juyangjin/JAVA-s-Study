package JIN221002.Chap04_if_else_for;

public class P123_1_ForSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
		sum += i;	
		}
		
		
		System.out.println("1~" + (i-1) + "합 :" + sum);
	}
}
