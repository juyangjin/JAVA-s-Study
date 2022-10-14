package JIN221002.Chap04_if_else_for;

public class P133_ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
