package day11;

public class Abstract01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cat cat1 = new Cat("비니","실바니안");
		cat1.eating("츄르");
		cat1.howl();
		
		Dog dog1 = new Dog("울프", "허스키");
		dog1.eating("고기");
		dog1.howl();
		

	}

}

class Cat extends Animal {
	private String eat;

	public Cat(String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		System.out.println(name + "의 울음소리 야옹!");

	}

	public void eating(String eat) {
		this.eat = eat;
		System.out.println(name + "는 " + eat + "를 좋아합니다.");
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

}

class Dog extends Animal {
	private String eat;

	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		System.out.println(name + "의 울음소리 멍멍!");

	}

	public void eating(String eat) {
		this.eat = eat;
		System.out.println(name + "는 " + eat + "를 좋아합니다.");
	}
	
	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

}

//abstract 지우면 오류가 난다.
abstract class Animal {
	protected String name;
	protected String category;

	public void printInfo() {
		System.out.println("이름: " + name + " / " + "종: " + category);
	}

	public abstract void howl();
}