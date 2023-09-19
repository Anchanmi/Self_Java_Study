package chap12_1.exam07;

public class User1 extends Thread{
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.setName("User1");
		this.cal = cal;
	}
	
	public void run() {
		cal.setMemory(100);
	}
}
