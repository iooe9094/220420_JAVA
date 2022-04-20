package Thread;

public class ex13_1 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1(); // Thread의 자손 클래스 인스턴스 생성
		
		Runnable r = new ThreadEx1_2(); // Runnable을 구현한 클래스의 인스턴스 생성
		Thread t2 = new Thread(r); // 생성자 Thread (Runable target)
		// Thread t2 = new Thread(new ThreadEx1_2()) 위의 두줄을 한줄로 축약 가능
		
		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName()); // 조상인 Thread의 getName()을 호출
		}
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for(int i=0; i<5; i++ ) {
			// Thread.currentThread() : 현재 실행중인 Thread를 반환
			System.out.println(Thread.currentThread().getName());
		}
	}
}
