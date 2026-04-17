package poly;
class Animal{
	String name;
	String sound;
	int legs;
	//overriding
	void makeSound() {
		//without parameter
		String result=String.format("name=%s and sound=%s and legs=%d",name,sound,legs);
	System.out.println(result);
		System.out.println("This is Animal Class");
	}
	void makeSound(String name,String sound){//with parameter
		System.out.println("this is animal");
		
	}
	void display() {
	
		String result=String.format("name=%s and sound=%s",name,sound);
	System.out.println(result);
	}
}
class Cat extends Animal{
	int legs;
	//when instance variable come you need to initialize that why use constructor
	Cat(String name,String sound,int legs){
		//inheritance ki vjh se super class ka constructor sub class ko call krata h
		super.name=name;
		super.sound=sound;
		this.legs=legs;
	}
	void makeSound() {
		//without parameter
				String result=String.format("name=%s and sound=%s and legs=%d",name,sound,legs);
			System.out.println(result);
				System.out.println("This is Animal Class");
			
		System.out.println("this is animal");
	}
}

public class MainPoly {
	public static void main(String[]args) {
		Animal n1=new Animal();
		n1.display();
		n1.makeSound();
		n1.makeSound();
		Cat c1=new Cat("Cat1","meow",4);
		c1.makeSound();
		
		
	}
	

}
