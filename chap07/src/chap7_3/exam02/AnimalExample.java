package chap7_3.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-------");
		
		Animal ani1 = new Dog();
		ani1.sound();
		Animal ani2 = new Cat();
		ani2.sound();
		System.out.println("-------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
