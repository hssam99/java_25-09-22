package day18;

public class Thread01 {

	public static void main(String[] args) throws InterruptedException {

		// Thread(쓰레드) : 실제 작업을 수행하는 단위
		/*
		 * - 프로그램이 실행되면 OS로부터 메모리를 할당 받아 process의 상태가 됨.
		 * - process 안에 작은 작업단위 Thread 단위로 실제 작업을 수행
		 * - Thread가 실제 CPU가 작업을 처리하는 단위 
		 * - multi-thread : 여러개의 thread가 동시에 수행되는 프로그램
		 * - CPU는 시간을 잘게 쪼게서 thread를 번갈아 수행함 (시분할 처리)
		 * - 사용자들은 동시에 처리되는 듯한 과를 가지게됨.
		 * - Thread는 각자의 자신의 작업공간을 가짐 (context)
		 * - 공유된 자원이 있음.
		 * - 여러 thread는 공유자원을 사용하려고 경쟁이 발생함.
		 * - 그 경쟁 구역을 critical section(임계영역)
		 * - 임계영역의 충돌(교착상태: deadlock)이 발생하지 않도록 동기화(순차처리)를 구현하여 오류를 막음
		 * - 스레드의 상태변화
		 * - 생성(New) -> 준비(Runnable) -> 실행(Running) -> 대기(Waiting/Blocked) -> 종료(Terminated)
		 */
		
		/*
		 * Thread를 구현 방법은 2가지
		 * 1. Thread 클래스를 상속하여 만들기
		 * 2. runnable 인터페이스를 구현하여 만들기
		 * 자바는 다중상속을 허용하지 않기 때문에
		 * 만약 클래스 상속 중이라면 인터페이스를 구현해야 함.
		 */
		
		
		String text = "깜빡깜빡~";

        for (int i = 0; i < 10; i++) {  // 깜빡임 10회
            // 보이게
            System.out.print("\r" + text);
            System.out.flush();
            Thread.sleep(500);

            // 사라지게
            System.out.print("\r");                // 커서를 맨 앞으로 이동
            System.out.print(" ".repeat(text.length())); // 덮어쓰기
            System.out.flush();
            Thread.sleep(500);
        }

        // 반복 끝난 후, 최종적으로 사라진 상태
        System.out.print("\r");                
        System.out.print(" ".repeat(text.length()));
        System.out.flush();
		
//		
//		// 현재 실행중인 스레드 이름
//		System.out.println(Thread.currentThread().getName()); //main
//		
//		MyThread th = new MyThread(); // thread - 0
//		// start() 호출 => 스레드 실행
//		// run() 을 호출하면 그냥 메소드를 호출하는 것과 같다, start를 하여 호출해야함.
//		
//		th.start();
//		
//		MyThread th2 = new MyThread(); // thread - 1
//		th2.start();
//		
//		System.out.println("thread end~!!");
		
		
	}

}


//// Thread 클래스를 상속하여 만들기
//class MyThread extends Thread{
//
//	@Override
//	public void run() {
//		// 1~ 2000까지 반복하는 쓰레
//		for(int i = 0; i<2000; i++) {
//			System.out.println(i+". thread > "+getName());
//		}
//		
//	}
//	
//}