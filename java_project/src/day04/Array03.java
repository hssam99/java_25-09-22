package day04;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 최대 최소 합계 평균 
		int arr[] = {89,78,58,69,84,51,26,35,69,75,96};
		
		int max = 0, min = 100, sum=0;
		double avg=0;
		
		for(int a:arr) {
			max = Math.max(a, max);
			min = Math.min(a, min);
			sum +=a;
		}
		
		avg = (double)sum/arr.length;
		
		
		System.out.println("최솟값: "+min);
		System.out.println("최대값: "+max);
		System.out.println("합계: "+sum);
		System.out.printf("평균: %.3f",avg);

	}

}
