package chap9_1.exam04;

public class Outter {
	//切郊 7戚穿
	public void method1(final int arg) {
		final int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//切郊 8 戚板
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100; 更走? 呪舛戚 照掬醤鞠澗汽 鞠革? せせせせせせせせせ;; final 識情 背爽澗惟 蟹聖牛
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
