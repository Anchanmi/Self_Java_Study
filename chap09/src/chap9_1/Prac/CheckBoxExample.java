package chap9_1.Prac;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox  check = new CheckBox();
		check.setOnSelectListener(new BackgroundChangeListener());
		check.select();
	}

}
