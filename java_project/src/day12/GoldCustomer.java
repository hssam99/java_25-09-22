package day12;

public class GoldCustomer extends Customer {
	public GoldCustomer() {}
	
	private double saleRatio; // 골드, VIP 할인율
	
	
	public GoldCustomer(int id, String name) {
		super(id,name);
		this.customerGrade = "Gold";
		this.customerPoint=0;
		this.pointRatio=0.02;
		this.saleRatio=0.1; // 10% 할인
	}
	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price); // 리턴값 사용안하고 적립만
//		int discountprice = (int)(price*0.9); // 10% 할인
//		int point = (int)(pointRatio*price);
//		this.customerPoint += point;
		return price - (int)(price*this.saleRatio);
	}
	@Override
	public void printCustomerInfo() {
		super.printCustomerInfo();
	}

}
