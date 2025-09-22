package day09;

public class Report {
	
	private String name;
	private int kr;
	private int eng;
	private int math;
	private int rank=1;
	
	
	// 생성자
	public Report() {
	}
	
	public Report(String name, int kr, int eng, int math) {
		this.name = name;
		this.kr = kr;
		this.eng = eng;
		this.math = math;
	}

	
	
	
	
	// method
	
	//sum
	public int sum() {
		return getEng()+getKr()+getMath();
	}
	
	//avg
	public double avg() {
		return sum()/3.0;
	}
	
	//print
	public void printReport() {
		System.out.println(getName()+"\t"+getKr()+"\t"+getEng()+"\t"+getMath()+"\t"
	+sum()+"\t"+Math.round(avg()*100)/100.0+"\t"+rank);
	}
	
	
	
	
	// getter setter
	
	public String getName() {
		return name;
	}

	public int getKr() {
		return kr;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Report [name=" + name + ", kr=" + kr + ", eng=" + eng + ", math=" + math + ", rank=" + rank + "]";
	}

	
	

}
