package chap7_2.exam02;

public class ChildExampke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child chi = new Child();
		
		Parent parent = chi;
		
		parent.method1();
		parent.method2();
		
		//parent.method3(); 호출 불가능
		
	}

}
