package chap6_6.exam06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.SetSpeed(-50);
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		myCar.SetSpeed(60);
		
		//�ش� if���� ���ϰ��� false�϶� �ڵ����� ���߱� ���� �ڵ� ���� �� �ڵ� ������ ���� �ӵ��� 0���� ����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
	}

}
