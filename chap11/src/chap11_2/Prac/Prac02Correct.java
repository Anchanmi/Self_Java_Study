package chap11_2.Prac;

import java.util.*;

public class Prac02Correct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		
		String strMonth = (month<10)? ("0" + month + "월 ") : ("" + month + "월 ");
		
		int day = now.get(Calendar.DAY_OF_MONTH);
		String strDay = (day < 10)? ("0" + day + "일 ") : ("" + day + "일 ");
		
		String[] dayArray = {"일", "월", "화", "수", "목", "금", "토"};
		int dayWeek = now.get(Calendar.DAY_OF_WEEK);
		String strDayWeek = dayArray[dayWeek - 1] + "요일 ";
		
		int hour = now.get(Calendar.HOUR);
		String strHour = (hour < 10)? ("0" + hour + "시 ") : (hour + "시 ");
		
		int minute = now.get(Calendar.MINUTE);
		String strMiute = (minute < 10)? ("0" + minute + "분") : (minute + "분");
		
		System.out.println(year + "년 " + strMonth + strDay + strDayWeek + strHour + strMiute);
	}

}
