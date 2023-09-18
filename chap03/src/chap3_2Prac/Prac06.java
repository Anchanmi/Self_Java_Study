package chap3_2Prac;

import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		
		System.out.println(value - (value % 100));
	}

}
