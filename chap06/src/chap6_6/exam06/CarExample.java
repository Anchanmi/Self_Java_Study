package chap6_6.exam06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.SetSpeed(-50);
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.SetSpeed(60);
		
		//해당 if문은 리턴값이 false일때 자동차를 멈추기 위한 코드 따라서 이 코드 때문에 밑의 속도도 0으로 나옴
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
