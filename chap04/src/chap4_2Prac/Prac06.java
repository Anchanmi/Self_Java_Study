package chap4_2Prac;

public class Prac06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 4; i++) {
			for(int j = 3; j >= 0; j--) {
				if(i + 1 > j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
