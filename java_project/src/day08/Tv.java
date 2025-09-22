package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Tv {
	
	Scanner sc = new Scanner(System.in);
	private String brand;
	private boolean power=false;
	private int ch;
	private int vol;
	
	private int[] favor = new int[5];
	private int cnt = 0; // 즐겨찾기 배열 위치 변수
	
	
	
	
	public Tv() {
		this.ch = 1;
		this.vol = 3;
		
	}
	
	public Tv(String brand) {
		this();
		this.brand = brand;
	}

	
	
	// method
	
	
	// 전원 on/off
	public void power() {
		power = !power;
	}
	
	
	//ch up&down
	
	public void chUp() {
		if(!power) {
			powerFalsePrint();
		} // 디버깅
		
		if(power) {
			ch = ch>=20?20:ch+1;
			printChannel();
		}
		
		
	}
	
	public void chDown() {
		if(!power) {
			powerFalsePrint();
		} // 디버깅
		
		if(power){
			ch = ch<=0?0:ch-1;
			printChannel();
		}
	}
	
	
	//vol up&down
	
	public void volUp() {
		if(!power) {
			powerFalsePrint();
		} // 디버깅
		
		if(power){
			vol = vol>=10?10:vol+1;
			printVolume();
		}

	}
	
	public void volDown() {
		if(!power) {
			powerFalsePrint();
		} //디버깅
		
		if(power){
			vol = vol<=0?0:vol-1;
			printVolume();
			if(vol==0) {
				System.out.println("음소거");
			}

		}
	}
	

	
	// pick favorite channel
	public void pickFavorite(int ch) {
		// 앞에서부터 값이 비어있으면 추가
		for(int i=0;i<favor.length;i++) {
			if(favor[i]==0) {
				favor[i]=ch;
				cnt++; //
				System.out.println("cnt: "+cnt);
				break;
			}
		}

		// 5개가 다 차있을경우
		if(cnt>6) {
			System.out.println("즐겨찾기를 더 이상 등록할 수 없습니다. 기존 채널을 삭제하고 추가로 등록하시겠습니까?");
			System.out.println("1. YES 2. NO");
			System.out.print(">>");
			int num = sc.nextInt();
			if(num==1) {
				System.out.println("[1.]"+favor[0]+" [2.]"+favor[1]+" [3.]"+favor[2]+" [4.]"+favor[3]+" [5.]"+favor[4]);
				System.out.println("삭제할 채널을 선택하세요");
				System.out.print(">>");
				int tmp = sc.nextInt();
				favor[tmp-1] = ch;
				System.out.println("즐겨찾기에 추가되었습니다!");
				printFavorite();
			}
		}
		
		
	}
	
	
	// delete favorite channel
	public void deleteFavorite() {
		int tmp=0;
		System.out.println("[1.]"+favor[0]+" [2.]"+favor[1]+" [3.]"+favor[2]+" [4.]"+favor[3]+" [5.]"+favor[4]);
		do {
			System.out.println("삭제할 채널을 선택하세요");
			System.out.print(">>");
			tmp = sc.nextInt();
		}while((favor[tmp-1]==0));
		favor[tmp-1] = 0;
		cnt--;
//		System.out.println("fvAdd="+fvAdd); // 디버깅
	}
	
	
	
	// print
	
	public void printVolume() {
		System.out.println("현재볼륨:" + getVol());
	}
	
	public void printChannel() {
		System.out.println("현재채널:" + getCh());
	}
	
	public void powerFalsePrint() {
		System.out.println("error! 전원이 꺼져있습니다.");
	}
	
	public void printFavorite() {
		System.out.println(Arrays.toString(favor));
	}
	
	
	
	
	
	
	// getter setter
	
	
	public boolean isPower() {
		return power;
	}


	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		if(!power) {
			powerFalsePrint();
		} // 디버깅
		
		if(power){
			this.ch = ch;
			printChannel();
		}
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		if(!power) {
			powerFalsePrint();
		} // 디버깅 
		
		
		if(power) {
			this.vol = vol;
			printVolume();
		}
	}

	@Override
	public String toString() {
		return "Tv [brand:" + brand + ", power:" + (power?"ON":"OFF") + ", ch:" + ch + ", vol:" + vol + "]";
	}
	
	
	

	
	
	

}
