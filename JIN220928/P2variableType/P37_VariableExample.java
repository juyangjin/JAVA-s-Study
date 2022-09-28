package JIN220928.P2variableType;

public class P37_VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		
		if(v1>10) {
			int v2 = v1 -10;
			int v3 = v1 + v2 + 5;//if 내부에 작성하는 것으로 해결
			System.out.println("v3=" + v1 + "+" + v2 + "+" + 5);//출력으로 결과확인
		}
		//int v3 = v1 + v2 + 5; //if 내부에 int v2가 선언되었기 때문에 외부사용 불가 문제로 에러
	}

}
