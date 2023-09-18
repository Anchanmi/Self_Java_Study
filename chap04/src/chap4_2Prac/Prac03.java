package chap4_2Prac;

public class Prac03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + num1 + ", " + num2 + ")");
			
			if(num1 + num2 == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
