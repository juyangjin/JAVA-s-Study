package JIN220929.Chap03_Operators;

public class P80_OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1000000;
		int y = 1000000;
		int z = x * y; //1000000*1000000는 intType에 저장할 수 있는 값의 범위를 초과
		
		System.out.println("쓰레기값:" + z);//위의 이유로 제대로 된 값이 아닌 쓰레기값이 출력
		
		long x1 = 1000000;
		long y1 = 1000000;
		long z1 = x1 * y1; //1000000*1000000가 longType(8byte)으로 저장됨
		
		System.out.println("고친 값:" + z1);//제대로 된 값이 출력됨.

	}

}
