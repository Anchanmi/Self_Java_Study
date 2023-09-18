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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scan.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("학생수> ");
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
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + ((double)sum / scores.length));
				break;
			case 5:
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
