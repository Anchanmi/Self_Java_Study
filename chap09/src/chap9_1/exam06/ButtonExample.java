package chap9_1.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		
		btn.setonClickListener(new CallListener());
		btn.touch();
		
		btn.setonClickListener(new MessageListener());
		btn.touch();
	}

}
