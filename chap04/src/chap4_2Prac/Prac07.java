package chap4_2Prac;

import java.util.Scanner;

public class Prac07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		int select = 0;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------------");
			System.out.print("����>");
			
			select = scan.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("������ �ݾ� : ");
				balance = scan.nextInt();
				System.out.println("���ݾ�>" + balance);
				total += balance;
				break;
			case 2:
				System.out.print("����� �ݾ� : ");
				balance = scan.nextInt();
				System.out.println("��ݾ�>" + balance);
				
				if(total < balance) {
					System.out.println("�ܰ� �����մϴ�. ���� �ܾ� : " + total);
				}
				total -= balance;
				break;
			case 3:
				System.out.println("�ܰ�>" + total);
				break;
			case 4:
				System.out.print("���α׷� ����");
				run = false;
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.���� �߿��� �����ּ���.");
			}
		}
	}

}
