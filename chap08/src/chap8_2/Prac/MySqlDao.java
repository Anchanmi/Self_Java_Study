package chap8_2.Prac;

public class MySqlDao implements DataAccessObject{
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}
	
	public void insert() {
		System.out.println("MySql DB�� ����");
	}
	
	public void update() {
		System.out.println("MySql DB�� ����");
	}
	
	public void delete() {
		System.out.println("MySql DB���� ����");
	}
}