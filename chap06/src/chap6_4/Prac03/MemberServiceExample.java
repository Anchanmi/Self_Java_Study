package chap6_4.Prac03;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService mem = new MemberService();
		boolean result = mem.login("hong", "12345");
		if(result) {
			System.out.println("�α��εǾ����ϴ�.");
			mem.logout("hong");
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}
