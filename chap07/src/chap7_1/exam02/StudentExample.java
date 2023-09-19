package chap7_1.exam02;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name : " + stu.name); //부모에게 상속받은 것 ssn도 포함
		System.out.println("ssn : " + stu.ssn);
		System.out.println("studentNo : " + stu.studentNo);
	}

}
