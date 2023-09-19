package chap11_2.Prac;

import java.util.*;

public class Prac02Correct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		
		String strMonth = (month<10)? ("0" + month + "�� ") : ("" + month + "�� ");
		
		int day = now.get(Calendar.DAY_OF_MONTH);
		String strDay = (day < 10)? ("0" + day + "�� ") : ("" + day + "�� ");
		
		String[] dayArray = {"��", "��", "ȭ", "��", "��", "��", "��"};
		int dayWeek = now.get(Calendar.DAY_OF_WEEK);
		String strDayWeek = dayArray[dayWeek - 1] + "���� ";
		
		int hour = now.get(Calendar.HOUR);
		String strHour = (hour < 10)? ("0" + hour + "�� ") : (hour + "�� ");
		
		int minute = now.get(Calendar.MINUTE);
		String strMiute = (minute < 10)? ("0" + minute + "��") : (minute + "��");
		
		System.out.println(year + "�� " + strMonth + strDay + strDayWeek + strHour + strMiute);
	}

}
