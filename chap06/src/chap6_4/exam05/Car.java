package chap6_4.exam05;

public class Car {
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i = 0; i <= 50; i += 10) {
			speed = i;
			System.out.println("�ü� : " + speed + "km/h");
		}
	}
}
