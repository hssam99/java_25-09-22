package java_project;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int kor, eng, math, sum;
		double avg;
		
		
		kor = 89;
		eng = 90;
		math = 69;
		
		
		sum = kor+eng+math;
		avg = ((double)sum/3);
		
		String result = (avg>=80)?"합격":"불합격";
		
		System.out.println("합계:"+sum+", 평균:"+avg+", 결과: "+result);
		
		
	}

}
