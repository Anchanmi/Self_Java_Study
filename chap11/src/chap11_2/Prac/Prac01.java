package chap11_2.Prac;

import java.util.*;
import java.text.*;

public class Prac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		//������ E �� �빮�� E
		System.out.println(sdf.format(now));
	}

}
