package chap2_4.prac;

import java.util.Scanner;

public class Prac02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		String strNum1 = scan.nextLine();
		
		System.out.print("두 번째 수 : ");
		String strNum2 = scan.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
		}

}
