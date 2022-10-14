package j221002.chap05_Reference;

public class P152P154_ArrayCreatByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 : " + sum1);
		int sum2 = add(new int[] {83,90,87});
		System.out.println("총합 : " + sum2);
		System.out.println();
	}

	private static int add(int[] scores) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
