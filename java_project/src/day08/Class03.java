package day08;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();

		c.setName("tesla");
		c.setColor("white");
		c.setYear(2025);

		System.out.println(c.toString());
		c.power();
		c.printPower();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.power();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.power();
		c.printPower();
		c.speedUp();

		Car c2 = new Car("ionic", "black", 2022);
		System.out.println(c2); // toString 안써도 사용 가능

	}

}

class Car {

	private String name;
	private String color;
	private int year;
	private boolean power;
	private int speed;

	// 생성자 위치 (메소드 위, 멤버변수 아래)
	// 객체를 생성할 때 초기값을 지정해 주는 역할

	// 생성자 오버로딩

	// 기본 생성자
	public Car() {

	}

	// 매개변수를 받는 생성자
	public Car(String name, String color, int year) {
		this.name = name;
		this.color = color;
		this.year = year;

	};

	// 메소드

	// 시동 끄기 켜기
	public void power() {
		if (speed == 0) {
			power = !power;
		} else {
			System.out.println("error! cannot turn off the car!");
		}
	}

	// 현재 차 상태 출력
	public void printPower() {
		System.out.println(power ? "ON" : "OFF");
	}

	public void printSpeed() {
		System.out.println("Speed: " + speed);
	}

	public void powerFalsePrint() {
		System.out.println("시동이 꺼져있습니다.\n시동을 먼저 켜주세요.");
	}

	// 스피드 조절
	public void speedUp() {
		if (power == true) {
			if (speed >= 260) {
				speed = 260;
			} else {
				speed += 20;
			}
			printSpeed();
		} else {
			powerFalsePrint();
		}
	}

	public void speedDown() {
		if (power == true) {
			if (speed <= 0) {
				speed = 0;
			} else {
				speed -= 20;
			}
			printSpeed();
		} else {
			powerFalsePrint();
		}
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isPower() {
		return power;
	}

	public int getSpeed() {
		return speed;
	}

	// toString

	@Override
	public String toString() {
		return "Car [name:" + name + ", color:" + color + ", year:" + year + ", power:" + power + ", speed:" + speed
				+ "]";
	}

}