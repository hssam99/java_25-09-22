package day17;


enum Category{
	// 상품 카테고리
	FOOD(0.1), // 식품 : 10%
	CLOTHING(0.08), // 의류 : 8%
	ELECTRONICS(0.15); // 전자제품 : 15%
	
	private final double vatRate;
	
	Category(double vatRate){
		this.vatRate = vatRate;
	}
	
	public double getVatRate() {
		return vatRate;
	}
	
	
}


public class EnumEx01 {

	public static void main(String[] args) {
		
		Product p1 = new Product("맥북프로", Category.ELECTRONICS, 2300000);
		System.out.println(p1);
		
		

	}

}


class Product{
	private String productName;
	private Category category;
	private int price;
	
	
	public Product() {}
	
	public Product(String name, Category cat, int price) {
		this.productName = name;
		this.category = cat;
		this.price = price;
	}
	
	
	public int getPricewithVAT() {
		double vat = price * category.getVatRate();
		return (int)(price+vat);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", category=" + category + ", price=" + price + "]";
	}
	
	
}
