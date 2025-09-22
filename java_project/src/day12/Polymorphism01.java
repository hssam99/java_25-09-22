package day12;

public class Polymorphism01 {

	public static void main(String[] args) {
		// 다형성

		Human h = new Human();
		h.move();
		h.readBook();
		
		Tiger t = new Tiger();
		t.move();
		t.hunting();
		
		Eagle e = new Eagle();
		e.move();
		e.symbol();
		
		Dog d = new Dog();
		d.move();
		d.walk();
		
		Cat c = new Cat();
		c.move();
		
		// 자식 타입으로 부모 객체 생성은 불가능하다.
//		Human h2 = new Animal(); // error
		
		
		System.out.println("----부모 타입으로 자식 객체를 생성----");
		
		// 상속 받은 객체에서 가지고 있는 메소드만 사용이 가능하다.
		// 자식 객체가 독립적으로 가지고 있는 메소드는 사용이 불가하다.
//		
//		Animal htemp = new Human();
//		htemp.move();
//		h1.readBook(); // 호출 불가능
		
		
		Animal h1 = new Human();
		h.move();
		
		Animal t1 = new Tiger();
		t.move();
		
		Animal e1 = new Eagle();
		e.move();
		
		Animal d1 = new Dog();
		d.move();
		
//		Animal c1= new Cat(); // 상속 안받았기 때문에 객체 생성 불가능 extend로 Animal로부터 상속 받아야 가능
		
		Animal[] animalList = new Animal[5];
		int cnt = 0;
		
		animalList[cnt++] = h1;
		animalList[cnt++] = t1;
		animalList[cnt++] = e1;
		animalList[cnt++] = d1;
		animalList[cnt++] = h; // 자동 형변환
		
		System.out.println("----Animal 배열 출력----");
		
		for(int i=0; i<cnt;i++) {
			animalList[i].move();
		}
		
		
		// 자식 객체가 가지고 있는 고유의 값을 사용하려면 자신의 객체로 다운캐스팅(down-casting) 해야함
		System.out.println();
		System.out.println("---다운캐스팅---");
		// 다운캐스팅은 자동으로 이루어지지 않음
		
		Human human = (Human)animalList[0]; // 다운 캐스팅(Animal 객체 Human 객체로 강제 형변환)
		human.readBook();
		
//		Eagle eagle = (Eagle)animalList[1]; // animalList[1]은 Tiger 객체, 형변환은 가능
//		eagle.symbol(); // 실제로 이글이 아닌 타이거 이기 때문에 캐스팅에러
	
		System.out.println(animalList[1] instanceof Tiger); // 진짜 타이거 객체가 맞니?
		
		if(animalList[1] instanceof Tiger) {
			Eagle eagle = (Eagle)animalList[1]; // animalList[1]은 Tiger 객체, 형변환은 가능
			eagle.symbol(); // 실제로 이글이 아닌 타이거 이기 때문에 캐스팅에러
		}else {
			Tiger tiger = (Tiger)animalList[1];
			tiger.hunting();
		}
		
		System.out.println();
		System.out.println("---다형성 메소드 활용---");
		Polymorphism01 p1 = new Polymorphism01();
		p1.moveAnimal(human);
		
		
	}
	
	public void moveAnimal(Human human) {
		human.move();
	}
	public void moveAnimal(Tiger tiger) {
		tiger.move();
	}

}

class Cat{
	public void move() {
		System.out.println("고양이는 살금살금 걷습니다.");
	}
}


class Dog extends Animal {

	@Override
	public void move() {
//		super.move();
		System.out.println("강아지가 아장아장 걷습니다.");
	}

	public void walk() {
		System.out.println("강아지가 산책을 합니다.");
	}
}

class Tiger extends Animal {

	@Override
	public void move() {
//		super.move();
		System.out.println("호랑이는 네발로 어슬렁거립니다.");
	}

	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다. ");
	}

}

class Eagle extends Animal {

	@Override
	public void move() {
//		super.move();
		System.out.println("독수리는 하늘을 날아다닙니다.");
	}

	public void symbol() {
		System.out.println("독수리는 미국을 상징하는 동물입니다.");
	}

}

class Human extends Animal {

	@Override
	public void move() {
//		super.move();
		System.out.println("사람은 두발로 걷습니다.");

	}

	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}

}

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
