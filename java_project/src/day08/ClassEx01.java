package day08;

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv lg = new Tv("LG");

//		lg.power();
//		lg.setCh(18);
//		lg.chUp(); // 19
//		lg.chUp(); // 20
//		lg.chUp(); // 20
//
//		lg.setVol(5);
//		lg.volUp(); // 6
//		lg.volUp(); // 7
//		lg.volUp(); // 8
//		lg.volUp(); // 9
//		lg.volUp(); // 10
//		lg.volUp(); // 10
//
//		lg.setCh(1);
//		lg.setVol(2);
//
//		lg.volDown(); // 1
//		lg.volDown(); // 0, 음소거
//		lg.volDown(); // 0, 음소거
//		lg.chDown(); // 0
//		lg.chDown(); // 0
//		
//		lg.setCh(11);
//		lg.setVol(7);
//		
//
//		lg.power();
//		// turn off error
//		lg.chDown();
//		lg.chUp();
//		lg.volDown();
//		lg.volUp();
//		lg.setVol(2);
//		lg.setCh(1);
//		lg.power();
//		lg.chUp();
//		
//		
		// 즐겨찾기 등록
		lg.pickFavorite(1);
		lg.pickFavorite(2);
		lg.pickFavorite(10);
		lg.pickFavorite(8);
		lg.pickFavorite(7);
		lg.printFavorite();
		lg.pickFavorite(6);
//		lg.deleteFavorite();
//		lg.deleteFavorite();
//		lg.printFavorite();
//		lg.pickFavorite(12);
//		lg.pickFavorite(16);
//		lg.printFavorite();
	}

}
