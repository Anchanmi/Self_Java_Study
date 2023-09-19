package chap9_1.exam06;

public class Button {
	OnClickListener listener;
	
	void setonClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}
}
