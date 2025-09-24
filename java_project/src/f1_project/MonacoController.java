package f1_project;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MonacoController {
	CircuitController cc = new CircuitController();
	DotArtController dac = new DotArtController();
	GameController gc = new GameController();
	
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	private int circuitIndex;
	public Circuit monaco;
	
	
	public MonacoController(Driver userDriver, int circuitidx) throws InterruptedException, IOException {
		this.circuitIndex=circuitidx;
		monaco = cc.getCircuitList().get(circuitIndex);
		cc.setWeather(circuitIndex);
	}
	
	
	
	public void introCircuit() throws InterruptedException {
		dac.printMonacoCircuitImage();
		System.out.print("entering Monaco");
		gc.printLoadingDot();

		monaco.printCircuitInfo();
		gc.printLoadingDot();
		System.out.print("Loading");
		gc.printLoadingDot();
		
		System.out.println("============================ GAME START ============================");
		System.out.println();
		
		
		String text1 = "세계에서 가장 화려하고, 가장 까다로운 그랑프리! 바로 모나코입니다!";
		gc.printStringOnebyOne(text1);
		String text2 = "좁은 도심 서킷, 가드레일과 맞닿은 트랙 위에서 펼쳐지는 드라마 같은 레이스!";
		gc.printStringOnebyOne(text2);
		String text3 = "도박 같은 추월, 한순간의 실수가 곧 리타이어로 이어지는 곳,";
		gc.printStringOnebyOne(text3);
		String text4 = "이곳이 바로 F1의 보석, 모나코 그랑프리입니다!";
		gc.printStringOnebyOne(text4);
		System.out.println();
		String text5 = "자, 이제 모든 준비가 끝났습니다.";
		gc.printStringOnebyOne(text5);
		String text6 = "엔진의 굉음과 함께, 드라이버들의 집중력이 극한으로 끌어올려지고 있습니다.";
		gc.printStringOnebyOne(text6);
		System.out.println();
		String text7 = "전 세계 팬들의 시선이 모여 있는 이 순간,";
		gc.printStringOnebyOne(text7);
		String text8 = "2025 FIA 포뮬러 원 월드 챔피언십, 모나코 그랑프리가 곧 시작됩니다!”";
		gc.printStringOnebyOne(text8);
		System.out.println();
		System.out.println("===================================================================");
		System.out.println();
		System.out.println();
	}
	
	
	public void printCourse1() {
		System.out.println("====================== Course 1 : Casino Square =========================");
		System.out.println();
		String txt1 = "이제 드라이버들이 카지노 스퀘어로 향합니다!";
		gc.printStringOnebyOne(txt1);
		String txt2 = "모나코의 화려한 카지노를 스쳐 지나며, 도심의 고급스러운 풍경 속에서 레이스가 이어집니다.";
		gc.printStringOnebyOne(txt2);
		String txt3 = "넓은 공간이지만 순간적으로 라인을 잘못 잡으면, 바로 다음 미라보 코너 진입에 큰 영향을 주게 됩니다.";
		gc.printStringOnebyOne(txt3);
		String txt4 = "대략 120~150km/h으로 달리며 정확한 브레이킹과 스티어링, 침착함이 요구되는 구간입니다!";
		gc.printStringOnebyOne(txt4);
		System.out.println();
		System.out.println("=========================================================================");
		System.out.println();
		System.out.println();
	}
	
	public void printCourse2() {
		System.out.println("============================ Course 2 : Fairmont Hairpin  ============================");
		System.out.println();
		String txt1 = "내리막 Mirabeau 코너를 지나, 세계에서 가장 느린 코너! Fairmont Hairpin 입니다!";
		gc.printStringOnebyOne(txt1);
		String txt2 = "전 세계 서킷 중 가장 느리고 가장 좁은 코너, 40~70km/h 속도까지 떨어지며 단 한 대의 차량만이 통과할 수 있습니다.";
		gc.printStringOnebyOne(txt2);
		String txt3 = "스티어링을 끝까지 꺾어야만 돌아나갈 수 있으며, 미세한 오차 하나에도 바리케이드와의 접촉이 불가피합니다.";
		gc.printStringOnebyOne(txt3);
		String txt4 = "이곳에서의 라인 선택은 곧 다음 가속 구간에서의 리듬으로 이어집니다!";
		gc.printStringOnebyOne(txt4);
		System.out.println();
		System.out.println("============================================================================");
		System.out.println();
		System.out.println();
	}
	
	public void printCourse3() {
		System.out.println("============================ Course 3 : Tunnel  ============================");
		System.out.println();
		String txt1 = "평균 속도 280 ~ 290 km/h가 뽑아져 나오는 모나코 그랑프리의 가장 빠른 구간, 터널에 진입합니다!";
		gc.printStringOnebyOne(txt1);
		String txt2 = "좁은 시가지 코스를 달리던 머신들이 이곳에서는 숨을 고르듯 가속 페달을 끝까지 밟아 올리죠.";
		gc.printStringOnebyOne(txt2);
		String txt3 = "어두운 터널 속을 뚫고 나와, 순간적으로 시야가 흔들리지만 드라이버들은 브레이크 포인트를 정확히 잡아야 합니다.";
		gc.printStringOnebyOne(txt3);
		String txt4 = "곧바로 이어지는 누벨 시케인을 앞두고, 이 직선 구간에서 최대한 속도를 끌어올리는 것이 관건입니다!";
		gc.printStringOnebyOne(txt4);
		System.out.println();
		System.out.println("=============================================================================");
		System.out.println();
		System.out.println();
	}
	
	
	public void playMonaco(Driver driver) throws InterruptedException, IOException {
		
		Driver userDriver = CircuitController.pc.getDriverListForGrandPix().get(driver.getDriverNum()-1);
		introCircuit();
		
		
		
		// 비가 오면 비올 때 잘 달리는 선수에게 가산점 부여
	    if(monaco.getCurrentWeather()==1) { // 비가 오면
	    	for(Driver d :CircuitController.pc.getDriverListForGrandPix()) {
	    		
	    		//비가 오는 날에 강한 선수타입이라면 
	    		if(d.getWeatherType()==1) {
//	    			System.out.println(d.getDriverName() + " 선수는 비 오는 날씨에 강한 선수입니다. +3점 가산점 부여!");/////////////////////디버깅 (정상작동)
	    			d.setCircuitPoint(d.getCircuitPoint() + 3);
	    		}
	    	}
	    }
	    
	    
	    String txt1 = "[TEAM RADIO] : "+userDriver.getDriverName()+" 오늘 날씨를 참고해서 어떤 타이어가 좋을지 선택해줘.";
	    gc.printStringOnebyOne(txt1);
	    userDriver.setTire(cc.setUserTire(userDriver)); // user 타이어 지정
	    cc.generateAiTire(userDriver); // AI 드라이버 타이어 지정
	    

	    System.out.println();
	    System.out.println();
	    
	    String txt2 = "[TEAM RADIO] : OK! "+userDriver.getDriverName()+" 모나코 그랑프리는 이번 시즌의 터닝포인트가 될거야. 힘내보자구.";
	    gc.printStringOnebyOne(txt2);
	    
	    System.out.println();
	    System.out.println();
	    
	    
		int startTime=cc.start(); // 너무 빨리 눌러서 부정출발하면 -1 리턴
		
		// 부정출발 했을 경우
		if(startTime==-1) {
			userDriver.setPenalty(userDriver.getPenalty()+1); // 패널티 1 추가 > 추후 마지막에 패널티*5 해서 circuitPoint 감점처리
			startTime = 905; // 꼴찌로 출발하도록 출발시간 강제 변경
		}
		
		// 스타트 코스
		userDriver.setCurrentSpeed(startTime); 
		cc.generateAICurrentSpeeds(userDriver, 300, 900); // AI 드라이버 속도 300~900 사이 지정
		cc.setStartPoint(); // 스타트 포인트 각 드라이버별로 기록
		
		
		
		Thread.sleep(1000);
		System.out.println();
		System.out.println();
		
		
		System.out.println("PRESS [ENTER] TO CONTINUE");
		sc.nextLine();
		
		
		// 중간 메시지
		gc.printRandomMessagesAfterCourse(0); // start courseType 0
		
		
		
		// 1번 코스 [Casino Square]
		Course course1 = new Course(1, "Casino Square", 2, 134); // 1-직선 2-곡선 3-유턴
		monaco.getCourseList().add(course1);
		
		printCourse1();
		
		System.out.print("속도를 입력하세요 > ");
		userDriver.setCurrentSpeed(sc.nextInt());
		sc.nextLine();
		cc.generateAICurrentSpeeds(userDriver, 120, 150);
		System.out.println();
		cc.setCurrentPoint(monaco.getCourseList().get(0).getBestSpeed()); // get(0) > 1번째 코스
		
		
		Thread.sleep(1000);
		System.out.println();
		System.out.println();
		
		
		System.out.println("PRESS [ENTER] TO CONTINUE");
		sc.nextLine();
		
		
		// 중간 메시지
		gc.printRandomMessagesAfterCourse(course1.getCourseType());
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		// 2번 코스 [Fairmont Hairpin]: 유턴
		Course course2 = new Course(2, "Fairmont Hairpin", 3, 44); // 1-직선 2-곡선 3-유턴
		monaco.getCourseList().add(course2);
		
		printCourse2();
		
		System.out.print("속도를 입력하세요 > ");
		userDriver.setCurrentSpeed(sc.nextInt());
		sc.nextLine();
		cc.generateAICurrentSpeeds(userDriver, 40, 70);
		System.out.println();
		cc.setCurrentPoint(monaco.getCourseList().get(1).getBestSpeed()); // get(1) > 2번째 코스
		
		Thread.sleep(1000);
		System.out.println();
		System.out.println();
		
		
		System.out.println("PRESS [ENTER] TO CONTINUE");
		sc.nextLine();
		
		// 중간 메시지
		gc.printRandomMessagesAfterCourse(course2.getCourseType());
		
		
		
		
		
		
		
		
		
		
//		/// 날씨 체인저 
//		
//		
//		System.out.println("갑자기 날씨가 변합니다...");
//		// 현재 날씨 상태 저장
//	    boolean prevRaining = cc.isRaining();
////	    System.out.println("디버깅 prevRaining:"+prevRaining); /////////// 디버깅
//	    // 날씨 결정 다시 (날씨 상태 반전)
//	    cc.setRaining(!prevRaining);
//	    monza.setCurrentWeather(!prevRaining?1:0);
//
//	    System.out.println(cc.isRaining() ? "비가 내리기 시작합니다. 오늘 경기 반전이 일어날까요?" :
//	    	"아 드디어 구름이 걷히고 해가 나기 시작합니다. 비가 멈췄어요! 경기 양상이 빠르게 달라질 것 같습니다!");
//	    System.out.println();
//	    System.out.println();
//	    System.out.println();
//	    Thread.sleep(500);
//	    
////	    System.out.println("디버깅 silverStone.getCurrentWeather():"+silverStone.getCurrentWeather()); /////////// 디버깅
//	    
//	    if(monza.getCurrentWeather()==1) { // 비가 오면
//	    	for(Driver d :CircuitController.pc.getDriverListForGrandPix()) {
//	    		//비가 오는 날에 강한 선수타입이라면 
//	    		if(d.getWeatherType()==1) {
////	    			System.out.println("디버깅"+d.getDriverName() + " 선수는 비 오는 날씨에 강한 선수입니다. +3점 가산점 부여!"); /////////////////////디버깅 (정상작동)
//	    			d.setCircuitPoint(d.getCircuitPoint() + 3);
//	    		}
//	    	}
//	    }
//	    
////		System.out.println("디버깅:"+CircuitController.pc.getDriverListForGrandPix()); /////////////////////디버깅 (정상작동)
//	    
//	    String text1 = "[TEAM RADIO] : Box Box...";
//	    gc.printStringOnebyOne(text1);
//	    String text2 = "[TEAM RADIO] : "+userDriver.getDriverName()+" 날씨가 달라졌어. 타이어를 교체해야 될 거 같아.";
//	    gc.printStringOnebyOne(text2);
//	    System.out.println("타이어를 교체하시겠습니까? [1]Yes  [2]No");
//	    int userChoice = gc.YesOrNo(sc);
//	    if(userChoice==1) {
//	    	userDriver.setTire(cc.setUserTire(userDriver)); // user 타이어 지정
//	    }
//	    cc.generateAiTire(userDriver); // AI 드라이버 타이어 재지정
//	    
////	    System.out.println("디버깅: ///////// 현재 나의 타이어:"+userDriver.getTire());  /////////////////////디버깅 (정상작동)
//	    
////		System.out.println("디버깅:"+CircuitController.pc.getDriverListForGrandPix()); /////////////////////디버깅 (정상작동)
//	    
//	    
//		System.out.println("PRESS [ENTER] TO CONTINUE");
//		sc.nextLine();
//		sc.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		
		// 3번 코스 [Tunnel]
		Course course3 = new Course(3, "Tunnel", 1, 294); // 1-직선 2-곡선 3-유턴
		monaco.getCourseList().add(course3);
		
		printCourse3();
		
		System.out.print("속도를 입력하세요 > ");
		userDriver.setCurrentSpeed(sc.nextInt());
		sc.nextLine();
		cc.generateAICurrentSpeeds(userDriver, 280, 300);
		System.out.println();
		cc.setCurrentPoint(monaco.getCourseList().get(2).getBestSpeed()); // get(2) > 3번째 코스
		
		
		Thread.sleep(1000);
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("PRESS [ENTER] TO CONTINUE");
		sc.nextLine();
		
		
		// 중간 메시지
		gc.printRandomMessagesAfterCourse(course3.getCourseType());
		
		
		
		
		// 피날레
		
		
		System.out.println(userDriver.getDriverName() + " 선수 "+userDriver.getCircuitRank()+"위로 들어오고 있습니다!!!!!");
		gc.printLoadingDot();
		System.out.println();
		System.out.println("정말 멋진 성적이네요, 곧 체크 플레그가 휘날립니다!!");
		gc.printLoadingDot();
		System.out.println();
		
		// 피날레 메시지
		gc.printRandomMessagesAfterCourse(4);
		
		Thread.sleep(1000);
		System.out.println();
		System.out.println();
		
		
		// 피날레 이미지 출력
		
		dac.printCheckFlag();
		Thread.sleep(500);
		dac.printFireWork();
		Thread.sleep(500);
		dac.printFinish();
		
		
		Thread.sleep(1000);
		System.out.println();
		System.out.println();
		
		
//		System.out.println("디버깅"+CircuitController.pc.driverListForGrandPix); /////// ///// ///// ///// ///// /// 디버깅
		
		
		
		for(Driver d:CircuitController.pc.getDriverListForGrandPix()) {
			if(d.getPenalty()>0) {
				
				int tmp = d.getCircuitPoint()-(d.getPenalty()*5); // 패널티 숫자만큼 -5
				if(tmp<0) {
					tmp = 0; // circuitPoint가 패널티 점수보다 낮아 포인트가 음수가 될 경우 0으로 초기화
				}
				
				d.setCircuitPoint(tmp);
//				System.out.println("패널티 실행!");
			}
		}
		
//		System.out.println("디버깅"+CircuitController.pc.driverListForGrandPix); /////// ///// ///// ///// ///// /// 디버깅
		
		
		// 순위 공개
		
		System.out.println("======================================================================================");
		System.out.println();
		System.out.println(monaco.getCircuitLocation()+" 그랑프리가 종료되었습니다.");
		gc.printLoadingDot();
		System.out.println("잠시 후 "+monaco.getCircuitName()+" 파이널 순위가 공개됩니다.");
		gc.printLoadingDot();
		System.out.println("======================================================================================");
		System.out.println();
		System.out.println();
		System.out.println();
		dac.printGrandPrixStandingImage();
		System.out.println("RANK \t DRIVER \t\t TEAM \t\t\t POINT");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println();
		cc.printGrandpixStanding();
		System.out.println();
		System.out.println("=====================================================================================");
		
//		System.out.println(CircuitController.pc.driverListForGrandPix); /////// ///// ///// ///// ///// /// 디버깅
		
		for(Constructor cs : CircuitController.pc.constructorList) {
			for(Driver d : cs.getDriverList()) {
				cs.setConstructorPoint(cs.getConstructorPoint()+d.getCircuitPoint());  // 컨스트럭터 포인트 누적
//				System.out.println(cs.getConstructorName()+"의 챔피언쉽 포인트: "+cs.getConstructorPoint()); /////// ///// ///// ///// ///// /// 디버깅
			}
		} // for 문 
		
		
		for(Driver d : CircuitController.pc.driverListForGrandPix) {
			d.setDriverPoint(d.getDriverPoint()+d.getCircuitPoint()); // driverPoint 누적

			// 다음 그랑프리를 위해 그랑프리 값 초기화
			d.setCircuitPoint(0);
			d.setCircuitRank(0);
			d.setCurrentSpeed(0);
			d.setPenalty(0);
			d.setTire(0);
			
		} // for 문 
		gc.printChampionshipConstructor();
//		System.out.println(CircuitController.pc.driverListForGrandPix); /////// ///// ///// ///// ///// /// 디버깅
		
		
		
		System.out.println(monaco.getCircuitName()+" 그랑프리 플레이가 종료되었습니다.");
		System.out.print("그랑프리 맵으로 돌아갑니다");
		gc.printLoadingDot();
		System.out.print("Loading");
		gc.printLoadingDot();
		Thread.sleep(1000);
		
		
	}

}
