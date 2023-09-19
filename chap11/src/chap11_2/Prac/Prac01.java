package chap11_2.Prac;

import java.util.*;
import java.text.*;

public class Prac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		//요일은 E 꼭 대문자 E
		System.out.println(sdf.format(now));
	}

}
