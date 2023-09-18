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
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			
			select = scan.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("예금할 금액 : ");
				balance = scan.nextInt();
				System.out.println("예금액>" + balance);
				total += balance;
				break;
			case 2:
				System.out.print("출금할 금액 : ");
				balance = scan.nextInt();
				System.out.println("출금액>" + balance);
				
				if(total < balance) {
					System.out.println("잔고가 부족합니다. 현재 잔액 : " + total);
				}
				total -= balance;
				break;
			case 3:
				System.out.println("잔고>" + total);
				break;
			case 4:
				System.out.print("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 중에서 눌러주세요.");
			}
		}
	}

}
