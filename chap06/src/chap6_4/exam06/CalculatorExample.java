package chap6_4.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		double result1 = cal.areaRectangle(10);
		double result2 = cal.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
	}

}
