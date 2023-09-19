package chap9_1.exam04;

public class Outter {
	//자바 7이전
	public void method1(final int arg) {
		final int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100; 뭐지? 수정이 안돼야되는데 되네? ㅋㅋㅋㅋㅋㅋㅋㅋㅋ;; final 선언 해주는게 나을듯
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
