package chap5_2Prac;

import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------");
			System.out.println("����> ");
			
			int selectNo = scan.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("�л���> ");
				studentNum = scan.nextInt();
				break;
			case 2:
				scores = new int[studentNum];
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scan.nextInt();
				}
				break;
			case 3:
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + ((double)sum / scores.length));
				break;
			case 5:
				run = false;
			}
		}
		System.out.println("���α׷� ����");
		
	}

}
