package multiThread;

public class ex13_3 {
	static long startTime = 0;

	public static void main(String[] args) {
		
		// 2st Thread 실행
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("소요시간1:" + (System.currentTimeMillis() - ex13_3.startTime));
		System.out.println("==========구분==========");
	}
}

class ThreadEx3_1 extends Thread {
	
	// 1st Thread 실행
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("소요시간2:" + (System.currentTimeMillis() - ex13_3.startTime));
	}
}
