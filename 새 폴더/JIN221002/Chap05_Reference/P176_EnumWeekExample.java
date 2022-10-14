package JIN221002.Chap05_Reference;

import java.util.Calendar;

public class P176_EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P172_Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = P172_Week.SUNDAY;break;
		case 2:
			today = P172_Week.MONDAY;break;
		case 3:
			today = P172_Week.TUESDAY;break;
		case 4:
			today = P172_Week.WEDNESDAY;break;
		case 5:
			today = P172_Week.THURSDAY;break;
		case 6:
			today = P172_Week.FRIDAY;break;
		case 7:
			today = P172_Week.SATURDAY;break;
		}
		
		System.out.println("오늘 요일: "+ today);
		
		if(today == P172_Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
