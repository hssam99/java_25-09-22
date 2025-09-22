package day12;

public class CustomerMain {

	public static void main(String[] args) {
		// 백화점 고객
		/*
		 * - 일반 고객 / Gold 고객(할인) / VIP 고객(할인, 전담상담사)
		 * 
		 * 고객 => Customer
		 * 
		 * - 기본 customerGrade = Silver
		 * - bonusRatio = 0.01 => 구매금액의 1% 적립
		 * 
		 * - 메서드
		 * 1. 보너스 적립 계산 메서드 (calcPrice)
		 * - 구매금액의 적립 보너스를 계산 => bonusPoint 구매시 적립 누적
		 * - 보너스 적립, 할인여부도 체크해서 구매 금액을 리턴
		 * 
		 * 2. 출력메서드
		 * - 홍길동 님은 VIP고객이며, 현재 보너스포인트는 1000점입니다.
		 * - 전담 상담사는 짱구이고, 번호는 1111입니다. <- VIP만
		 * 
		 * 등급
		 * Silver(기본) / Gold / VIP
		 * - Silver 등급
		 * - 제품을 구입할 때 0% 할인 / 보너스 포인트는 1% 적립
		 * - Gold 등급
		 * - 제품을 구입할 때 10% 할인 / 보너스 포인트는 2% 적립
		 * - VIP 등급
		 * - 제품을 구입할 때 10% 할인 / 보너스 포인트는 3% 적립
		 * - 전담 상담사를 멤버변수에 추가(agentName, agentNum)
		 * 
		 * Customer => Silver
		 * 
		 * GoldCustomer extends Customer{
		 * 		기본 메서드 오버라이딩 해서 사용
		 * }
		 * 
		 * VIPCustomer extends Customer{
		 * 		추가 + 기본메서드 오버라이딩 해서 사용
		 * }
		 * 
		 */
		
		
//		// 에이전트 리스트 만들기 >> 이걸 할려면 controller class를 별도로 만들어서 진행하는것이 맞다.
//		Agent[] agentList = new Agent[3]; // VIP 고객 관리 에이전트리스트
//		agentList[0]= new Agent("Jennie", "111");
//		agentList[1]= new Agent("Daniel", "222");
//		agentList[2]= new Agent("Harry", "333");
		
		final int TOTAL = 10;
		
		Customer[] customerList = new Customer[TOTAL];
		customerList[0] = new Customer(1111, "KIMTAEJUN");
		customerList[1] = new GoldCustomer(2222, "KANGMINJI");
		customerList[2] = new VIPCustomer(3333, "LEEJAEYOON", "Jennie", 101);
		customerList[3] = new Customer(4444, "HANSOHEE");
		customerList[4] = new Customer(5555, "KIMJISOO");
		customerList[5] = new Customer(6666, "HONGSUMIN");
		customerList[6] = new GoldCustomer(7777, "JANGWONYOUNG");
		customerList[7] = new Customer(8888, "KIMJAEMIN");
		customerList[8] = new VIPCustomer(9999, "LEEHYUN", "Jennie", 101);
		customerList[9] = new VIPCustomer(1000, "LEEJINSU", "Daniel", 102);
		
		
		System.out.println("---------------------할인율과 포인트 계산---------------------");
		
		int price=10000;
		System.out.println("결제금액:"+price);
		System.out.println();
		for(Customer c :customerList) {
			int salePrice = c.calcPrice(price);
			System.out.println("("+c.customerGrade+")"+c.customerName+"    \t금액: "+salePrice+" / 포인트 : "+c.customerPoint);
		}
		
		
		System.out.println();
		System.out.println("고객 정보 리스트");
		System.out.println("==========================================================");
		
		
		
		for(Customer c :customerList) {
			c.printCustomerInfo();
//			System.out.println("----------------------------------------------------------");
		}

		
		// 다운캐스팅
		// 102 퇴사 > 담당자 101로 변경
		for(Customer c : customerList) {
			if(c instanceof VIPCustomer) {
				VIPCustomer vip = (VIPCustomer)c;
				if(vip.getAgentNum()==102) {
					vip.setAgentNum(101);
					vip.setAgentName("Jennie");
				}
			}
		}
		
		System.out.println();
		System.out.println("-----VIP 고객 리스트-----");
		
		for(Customer c : customerList) {
//			// equals 사용
//			if(c.customerGrade.equals("VIP")) {
//				System.out.println(c.customerId + "\t"+ c.customerName);
//			}
			// instance 
			if(c instanceof VIPCustomer) {
				System.out.println(c.customerId + "\t"+ c.customerName);
			}
		}
		
		
		
		
		
		

	}

}
