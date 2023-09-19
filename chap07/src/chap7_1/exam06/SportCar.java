package chap7_1.exam06;

public class SportCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/* final 메소드는 재정의가 안되기 때문에 컴파일 오류
	 @Override
	 public void stop(){
	 	System.out.println("스포츠카를 멈춤.");
	 	speed = 0;
	 	}
	 */
}
