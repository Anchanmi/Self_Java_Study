package chap12_2.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {}
		
		thread.interrupt();
	}

}
