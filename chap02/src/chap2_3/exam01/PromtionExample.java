package chap2_3.exam01;

public class PromtionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ� : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("long Value : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
	}

}
