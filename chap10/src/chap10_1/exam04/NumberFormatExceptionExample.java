package chap10_1.exam04;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "100";
		String data2 = "a100";
		
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		
		int result = val1 + val2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}

}
