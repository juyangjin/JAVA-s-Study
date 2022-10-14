package JIN221002.Chap04_if_else_for;

public class P125_2_WhileSumFrom1To100Example { //1부터 100까지 합을 출력

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //sum값 초기화
		
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + "합: " + sum);
	}

}
