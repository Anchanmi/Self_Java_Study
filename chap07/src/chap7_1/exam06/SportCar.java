package chap7_1.exam06;

public class SportCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/* final �޼ҵ�� �����ǰ� �ȵǱ� ������ ������ ����
	 @Override
	 public void stop(){
	 	System.out.println("������ī�� ����.");
	 	speed = 0;
	 	}
	 */
}
