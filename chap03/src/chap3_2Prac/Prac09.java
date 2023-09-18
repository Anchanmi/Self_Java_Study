package chap3_2Prac;

import java.util.Scanner;

public class Prac09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		double num1 = scan.nextDouble();
		
		System.out.print("두 번째 수: ");
		double num2 = scan.nextDouble();
		
		double result = num1 / num2;
		
		System.out.println("---------------------");
		
		if(num2 == 0) {
			System.out.println("결과 : 무한대");
		}
		else {
			System.out.println("결과 : " + result);
		}
		
	}

}
