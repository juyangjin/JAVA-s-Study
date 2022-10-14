package j221002.chap05_Reference;

public class P179_EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P172_Week today = P172_Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드
		 P172_Week day1 = P172_Week.MONDAY;
		 P172_Week day2 = P172_Week.WEDNESDAY;
		 int result1 = day1.compareTo(day2);
		 int result2 = day2.compareTo(day1);
		 System.out.println(result1);
		 System.out.println(result2);
		 
		 //valueOF() 메소드
		 if(args.length == 1) {
			 String strDay = args[0];
			 P172_Week weekDay = P172_Week.valueOf(strDay);
			 if(weekDay == P172_Week.SATURDAY || weekDay == P172_Week.SUNDAY) {
				 System.out.println("주말 이군요.");
			 } else {
				 System.out.println("평일 이군요.");
			 }
		 }
		 
		 //value() 메소드
		 P172_Week[] days = P172_Week.values();
		 for(P172_Week day : days) {
			 System.out.println(day);
		 }
	}

}
