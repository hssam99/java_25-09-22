package day04;

public class For08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//구구단
		
		for(int i=2;i<10;i++) {
			System.out.println("===="+i+"단====");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		
		System.out.println();
		
		
		
		
		
		//구구단 가로
		
		for(int i=2;i<10;i++) {
			System.out.print(i+"단\t");
		}
		
		System.out.println();
		
		for(int i=1;i<10;i++) {
			//System.out.println("===="+i+"단====");
			for(int j=2;j<10;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
	}

}
