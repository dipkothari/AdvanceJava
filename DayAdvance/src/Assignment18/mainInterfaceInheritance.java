package Assignment18;

interface PetAnimal{
	void name();
}
class Animal {
	
	 void inClass1() {
	 }
}
 class Hippo extends Animal{
	 public void name() {
		 System.out.println();
	 }
	public void inClass1() {
	System.out.println("Hippo class");
}
}

class Dog extends Animal implements PetAnimal{
	public void inClass1() {
		System.out.println("Dogs class");
	}
	public void name() {
		System.out.println("Dog class");
	}
	
}
class Cat extends Animal implements PetAnimal{
	public void inClass1() {
		System.out.println("Cat class");
	}
	public void name() {
		System.out.println("Cat class");
	}
	
}




public class mainInterfaceInheritance {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.inClass1();
		//dog.name();
		PetAnimal cat = new Cat();
		cat.name();
		
		Dog dog1 = new Dog();
		dog1.name();
		
	}

}
