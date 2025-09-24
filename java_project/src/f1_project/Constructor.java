package f1_project;

import java.util.ArrayList;
import java.util.List;

public class Constructor {
	
    private String constructorName;      // 팀 이름 (예: 페라리, 레드불)
    private int constructorCode;         // 팀 코드
    private List<Driver> driverList;     // 팀 내 드라이버 목록
    private int constructorPoint;        // 팀 점수 (드라이버 점수 합계)
    private int constructorRank;		 // 팀 등수

    
    
    // 생성자
    public Constructor(String constructorName, int constructorCode) {
        this.constructorName = constructorName;
        this.constructorCode = constructorCode;
        this.driverList = new ArrayList<>();
        this.constructorPoint = 0;
    }

    
    // 드라이버 추가 메소드
    public void addDriver(Driver driver) {
        driverList.add(driver);
    }
    
   
    
    // 특정 팀 소속 드라이버 목록 반환 (대소문자 구분 없이)
    public List<Driver> getDriversByConstructor(String constructorName) {
    		List<Driver> filteredDrivers = new ArrayList<>();
    		for (Driver d : driverList) {
    			if (((String) d.getConstructor()).equalsIgnoreCase(constructorName)) {
    				filteredDrivers.add(d);
    			}
    		}
    		return filteredDrivers;
    }

    // 각종 getter
    public String getConstructorName() {
        return constructorName;
    }

    public int getConstructorCode() {
        return constructorCode;
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public int getConstructorPoint() {
        return constructorPoint;
    }

    // 팀 정보 출력
    public void printConstructorInfo() {
        System.out.println("팀명: " + constructorName + " (코드: " + constructorCode + ")");
        System.out.println("드라이버 목록:");
        for (Driver d : driverList) {
            System.out.println("- " + d.getDriverName() + ", 출발 속도: " + d.getCurrentSpeed());
        }
        System.out.println("총 점수: " + constructorPoint);
    }


	public void setConstructorName(String constructorName) {
		this.constructorName = constructorName;
	}


	public void setConstructorCode(int constructorCode) {
		this.constructorCode = constructorCode;
	}


	public void setDriverList(List<Driver> driverList) {
		this.driverList = driverList;
	}


	public void setConstructorPoint(int constructorPoint) {
		this.constructorPoint = constructorPoint;
	}


	public int getConstructorRank() {
		return constructorRank;
	}


	public void setConstructorRank(int constructorRank) {
		this.constructorRank = constructorRank;
	}

}
