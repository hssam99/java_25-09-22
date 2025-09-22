package day12;

public class VIPCustomer extends Customer{
	private String agentName; // 전담상담사
	private int agentNum; // 전담상담사번호
	private double saleRatio; // 골드, VIP 할인율
	
	public VIPCustomer() {}
	
	public VIPCustomer(int id, String name, String agentName, int agentNum) {
		super(id,name);
		this.customerGrade="VIP";
		this.customerPoint = 0;
		this.pointRatio=0.03;
		this.saleRatio=0.1; // 10% 할인
		this.agentName = agentName;
		this.agentNum = agentNum;
	}
	
	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price); // 적립 실행
		return price - (int)(price*this.saleRatio);
	}

	@Override
	public void printCustomerInfo() {
		super.printCustomerInfo();
		System.out.println("전담 상담사는 "+getAgentName()+"("+getAgentNum()+")입니다.");
	}

	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public int getAgentNum() {
		return agentNum;
	}
	public void setAgentNum(int agentNum) {
		this.agentNum = agentNum;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	@Override
	public String toString() {
		return "VIPCustomer [agentName=" + agentName + ", agentNum=" + agentNum + ", saleRatio=" + saleRatio + "]";
	}

}
