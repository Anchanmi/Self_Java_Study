package chap10_2.exam05;

public class ThorwsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
		} catch(ClassNotFoundException e){
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}