package day16;

public class Customer {
	
	private String customerName;
	private int customerAge;
	private int customerFee;
	
	
	public Customer() {}
	
	public Customer(String name, int age) {
		this.customerName=name;
		this.customerAge=age;
		
		//여행비용이 15세 이상은 100만원, 15세 미만은 80만원 계산
		if(age>=15) {
			this.customerFee=100;
		}else {
			this.customerFee=80;
		}
	}

	public void printCustomerFee(String name) {
		System.out.println(name+"님의 여행경비는 "+customerFee+"원 입니다.");
	}
	
	
//	public void printCustomerInfo() {
//		System.out.println(customerName);
//	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public int getCustomerFee() {
		return customerFee;
	}

	public void setCustomerFee(int customerFee) {
		this.customerFee = customerFee;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerAge=" + customerAge + "]";
	}

	
	
	
	
	
	

}
