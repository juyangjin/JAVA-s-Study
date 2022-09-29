package JIN220928.Chap02_VariableType;

import java.util.Scanner; //import로 Scanner 호출(미호출시 에러발생, Scanner 사용을 위해 필수)

public class P54_2_CheckValueBeforeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i = 128; //저자는 i값을 고정값으로 두었지만, i의 값을 사용자가 입력받도록 변경해보았다.
		
		int i=0;//i값을 0으로 초기화
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("i값을 입력하여주세요");
		i = Scan.nextInt(); //입력된 값이 i에 저장됨.
		
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) { //논리연산자 사용 시 괄호 2개 치는 것 잊지말기
			System.out.println("byte타입으로 변환할 수 없습니다."); //i 값이 128이기 때문에 Byte의 최솟값인 -128 보다작거나, 최댓값인 127보다 크면 만족한다는 조건에 만족하게 된다.
			System.out.println("값을 다시 확인해 주세요");
		} else {//만약 i값이 위에 조건에 만족하지 않으면 값이 ByteType으로 변환되어도 에러가 없으므로 else에서 형변환을 하게 된다.
			byte b = (byte) i;
			System.out.println("입력값:" + b + "\ni값이-128이상이면서 127이하이므로 ByteType형변환 성공");
		}

	}

}
