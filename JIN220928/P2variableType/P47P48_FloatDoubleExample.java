package JIN220928.P2variableType;

public class P47P48_FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실수값 저장
		double var1 = 3.14;
		//float var2 = 3.14;  //컴파일에러, float인데 F가 없기 때문 
		float var3 = 3.14F;
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890012345678F; 
		
		System.out.println("var1:" + var1);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;//0이 6개
		float var8 = 3e6F;//0이 6개에 F로 float타입저장
		double var9 = 2e-3;//0이 -3개, 즉 소숫점 3번째
		
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8);
		System.out.println("var9:" + var9);
		
	}

}
