package day08;

public class Card {
	
	
	private int num;
	private String shape;
	//♣ ♦ ♥ ♠
	
	public Card() {
		
	}
	
	public void printCard() {
		if(num<=10&&num>=2) {
			System.out.print(shape+Integer.toString(num)+"\t");
		}else if(num==1){
			System.out.print(shape+"A"+"\t");
		}else
			switch (num) {
			case 11:
				System.out.print(shape+"J"+"\t");
				break;
			case 12:
				System.out.print(shape+"Q"+"\t");
				break;
			case 13:
				System.out.print(shape+"K"+"\t");
				break;

			default:
				break;
			}
		}
		
		
		
	
	public int getNum() {
		return num;
	}
	
	
	public void setNum(int num) {
		if(num<=13&&num>=0) { // num이 1~13 사이일경우
			this.num=num;
		}else {
			this.num=1;
			}
	}
	
	
	public String getShape() {
		return shape;
	}
	
	public void setShape(String shape) {
		switch (shape) {
		case "♣":
			this.shape = shape;
			break;
		case "♦":
			this.shape = shape;
			break;
		case "♠":
			this.shape = shape;
			break;

		default:
			this.shape = "♥";
			break;
		}
	}
	
	
	@Override
	public String toString() {
		return "Card [num=" + num + ", shape=" + shape + "]";
	}
	
	//setter

}
