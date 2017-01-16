package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		 Calendar cal=Calendar.getInstance();
		 printDate(cal);
		 
		 //특정날짜세팅하
		 cal.set(Calendar.YEAR, 2007);
		 cal.set(Calendar.MONTH, 10);// 11
		 cal.set(Calendar.DATE,12);
		 
		 //기념일
		 cal.set(2008, 10,12);
		 cal.add(Calendar.DATE,10000);//10000일째 되는날
		 printDate(cal);
	}
	
	public static void printDate(Calendar cal){
		String[] days={"","일","월","화","수","목","금","토"};
		int year=cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int day=cal.get(Calendar.DAY_OF_WEEK);//1(일)~7(토)
		int hour=cal.get(Calendar.HOUR);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND	);	
		
	
	System.out.println(year+"-"+(month+1)+"-"+date+""
			+ "( "+day+")"+hour+":"+min+":"+sec);
	
	}

	
}
