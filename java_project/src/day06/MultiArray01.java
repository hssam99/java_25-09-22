package day06;

public class MultiArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] arr = {
				{1,2,3},
				{4,5,6}
		};
		
		System.out.println("----------");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println("----------");
		
		int cnt = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = i+10;
				System.out.println(arr[i][j]+" ");
				cnt++;
				
			}
			System.out.println();
		}
		

	}

}
