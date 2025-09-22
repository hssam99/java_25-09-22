package day10;

public class Super02 {

	public static void main(String[] args) {
		
		Dog d = new Dog("뽀삐","강아지");
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("나비","고양이");
		c.printInfo();
		c.howl();
	}

}

// Child Class
class Dog extends Animal{

	public Dog(String name, String category) {
		super(name, category);
	}
	
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍~!");
	}
	
}


class Cat extends Animal{
	
	
	public Cat(String name, String category) {
		super(name, category);
	}
	
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹~!");
	}
	
	
}


// parent class
class Animal{
	private String name;
	private String category;
	
	
	public Animal() {
		
	}
	
	public Animal(String name, String category) {
		this.name=name;
		this.category=category;
	}

	
	// 출력메소드 
	public void printInfo() {
		System.out.println("name: "+ name+ "("+ category+")");
	}
	
	
	// 울음소리
	public void howl() {
		System.out.println("--"+name+"의 울음소리--");
	}
	
	
	
}