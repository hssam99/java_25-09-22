package day08;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//♣ ♦ ♥ ♠
//		
//		String[] shape = {"♣", "♦", "♥","♠"};
//		
//		
//		
//		Card c = new Card();
//		
//		
//		
////		c.setNum(0);
////		c.setShape("♣");
////		c.printCard();
//		
//		
//		for(String s : shape) {
//			for(int i = 0; i<=13;i++) {
//				c.setNum(i);
//				c.setShape(s);
//				c.printCard();
//			}
//			
//			System.out.println();
//			
//		}
//		
		
		
		CardPack cp = new CardPack();
		
//		System.out.println(cp);
		
		cp.makePack();
		
//		cp.printPack();
		cp.mixPack();
		cp.printPack();
		
		

	}

}
