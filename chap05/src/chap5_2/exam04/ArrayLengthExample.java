package chap5_2.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("ÃÑÇÕ : " + sum);
		
		double avg = sum / 3.0;
		System.out.printf("Æò±Õ : %.2f", avg);
	}

}
