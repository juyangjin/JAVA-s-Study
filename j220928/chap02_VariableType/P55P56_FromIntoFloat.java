package j220928.chap02_VariableType;

public class P55P56_FromIntoFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780; 
		
		float num3 = num2; //float형은 부호1bit + 지수8bit + 가수 23bit인데, num2의 값은 가수23bit 값으로 전부표현이 불가하므로 근사치로 변환된다.
		num2 = (int) num3; //근사치로 변환된 num3값은 int 형으로 다시 형변환되어 num2에 저장된다.
		int result = num1 - num2; //원래라면 num1,num2의 값이 동일하기 때문에 result값이 0이 되어야 맞다.
		System.out.println(result); //그러나 float형으로 거치면서 num2 값이 손실되었기 때문에 결과값은 -4가 된다.
	}
}
