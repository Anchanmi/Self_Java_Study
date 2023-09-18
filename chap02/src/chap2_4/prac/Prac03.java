package chap2_4.prac;

import java.util.Scanner;

public class Prac03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : ");
		String str1 = sc.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리 : ");
		String val1 = sc.nextLine();
		
		System.out.print("3. 전화번호 : ");
		String str2 = sc.nextLine();
		
		System.out.println();
		
		System.out.println("[입력한 내용]");
		System.out.println(str1);
		System.out.println(val1);
		System.out.println(str2);
	}

}
