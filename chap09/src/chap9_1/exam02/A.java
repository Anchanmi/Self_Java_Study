package chap9_1.exam02;

public class A {
	B field1 = new B();
	C filed2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	static C field4 = new C();
	static void method2() {
		C var2 = new C();
	}
	
	
	class B{}
	static class C{}
}

