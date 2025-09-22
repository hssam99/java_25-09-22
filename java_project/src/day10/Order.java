package day10;

public class Order extends Product{
	private int count;
	private int sum;
	
	
	public Order() {}
	
	public Order(String name, int price, int count) {
		super(name, price);
		this.count = count;
		this.sum = price * count;
	}
	
	


	public void add(String name, int price, int count) {
		// TODO Auto-generated method stub
		super.add(name, price);
		this.count = count;
		this.sum = super.getPrice() * this.count; // 그냥 price * count 도 가능하다.
	}
	
	
	public void printOrder() {
		System.out.println(super.getName() + "\t"+count+"\t"+sum);
	}
	
	
	
	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Order [count=" + count + ", sum=" + sum + "]";
	}
	

}
