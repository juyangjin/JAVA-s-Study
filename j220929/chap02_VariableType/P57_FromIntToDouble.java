package j220929.chap02_VariableType;

public class P57_FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780; 
		
		double num3 = num2; //float이 아닌 double 사용으로 값의 손실 없이 형변환
		num2 = (int) num3; //num3값이 int 형으로 다시 형변환되어 num2에 저장된
		int result = num1 - num2; 
		System.out.println(result); 
	}

}
