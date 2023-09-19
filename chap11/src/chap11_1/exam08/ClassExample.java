package chap11_1.exam08;

public class ClassExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class clazz = Car.class;
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
