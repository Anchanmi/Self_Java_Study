package chap11_1.exam09;

public class ResourcePathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("1.png").getPath();
		String photo2Path = clazz.getResource("images/2.png").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
