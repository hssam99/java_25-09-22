package day05;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=0, min=51, sum=0;
		double avg=0;
		int[] arr = new int[10];
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*50)+1;
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		
		for(int i =0;i<arr.length;i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		for(int i : arr) {
			sum +=i;
		}
		
		avg = sum/arr.length;
		
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(avg);
		
		
	}

}
