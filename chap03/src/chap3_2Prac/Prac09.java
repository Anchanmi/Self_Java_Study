package chap3_2Prac;

import java.util.Scanner;

public class Prac09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù ��° ��: ");
		double num1 = scan.nextDouble();
		
		System.out.print("�� ��° ��: ");
		double num2 = scan.nextDouble();
		
		double result = num1 / num2;
		
		System.out.println("---------------------");
		
		if(num2 == 0) {
			System.out.println("��� : ���Ѵ�");
		}
		else {
			System.out.println("��� : " + result);
		}
		
	}

}
