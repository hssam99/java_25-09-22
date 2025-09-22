package day15;

public class Order<K,V> extends Sale<K, V> {
	
	private int qty; // 물건 수량
	private int total; // 전체가격
	
	
	public Order() {}
	public Order(Sale<K,V> s, int qty) {
		super(s.getProductName(),s.getPrice());
		this.qty=qty;
		this.total = qty * (int)s.getPrice();
	}
	
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	

}
