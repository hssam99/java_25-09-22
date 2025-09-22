package day12;

public class Customer {
	
	// 부모클래스 멤버 변수의 접근제어자는 protected로 설정하는것이 통상적
	protected int customerId; // 고객 아이디
	protected String customerName; // 고객 이름
	protected String customerGrade; // 고객 등급
	protected int customerPoint; // 포인트
	protected double pointRatio; // 적립비율
	
	
	public Customer(){};
	
	public Customer(int id, String name) {
		this.customerId=id;
		this.customerName=name;
		this.customerGrade="Silver"; // 기본 실버
		this.customerPoint=0;
		this.pointRatio=0.01; // 구매 금액 1% 적립
		
	}
	
	public int calcPrice(int price) {
		int point = (int)(pointRatio*price);
		this.customerPoint += point;
//		setCustomerPoint(getCustomerPoint()+point);
		return price;
	}
	
	public void printCustomerInfo() {
		System.out.println(customerName+"님은 "+customerGrade+
				" 고객이며, 현재 적립하신 포인트는 "+customerPoint+"점 입니다.");
	}	
	
	// protected 이기 때문에 getter setter 필요없음
//	public int getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
//	public String getCustomerName() {
//		return customerName;
//	}
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
//	public String getCustomerGrade() {
//		return customerGrade;
//	}
//	public void setCustomerGrade(String customerGrade) {
//		this.customerGrade = customerGrade;
//	}
//	public int getCustomerPoint() {
//		return customerPoint;
//	}
//	public void setCustomerPoint(int customerPoint) {
//		this.customerPoint = customerPoint;
//	}
//	public double getPointRatio() {
//		return pointRatio;
//	}
//	public void setPointRatio(double pointRatio) {
//		this.pointRatio = pointRatio;
//	}
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", customerPoint=" + customerPoint + ", pointRatio=" + pointRatio + "]";
	}
}











