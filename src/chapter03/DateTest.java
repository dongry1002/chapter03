package chapter03;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now=new Date();
		printDate(now);
		printDate2(now);
		
		//년(-1900), 월(0~11),일
	Date d1=new Date(100,0,16);
	printDate(d1);
	
	Date d2=new Date(100,0,16,13,25,30);
	printDate(d2);
	
	
	//1970년 1월1일 00:00:00.000이후에
	//milliseconds값을 세팅
	long milliseconds=24*60*60*1000*365*30;
	Date d3=new Date(milliseconds);
	printDate(d3);
	
	
	//

	}

	

	private static void printDate(Date now) {
	
		
	}
private static void printDate2(Date now) {
		// TODO Auto-generated method stub
		
	}
}
