package chap6_4.Prac03;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService mem = new MemberService();
		boolean result = mem.login("hong", "12345");
		if(result) {
			System.out.println("로그인되었습니다.");
			mem.logout("hong");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
