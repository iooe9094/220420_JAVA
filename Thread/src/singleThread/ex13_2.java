package singleThread;

public class ex13_2 {

	public static void main(String[] args) {
		
		// currentTimeMills() : 시스템 시간 계산 메소드 (ms단위)
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
		System.out.println("소요시간 1:" + (System.currentTimeMillis()- startTime));
	    System.out.println("==============구분===============");
		
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
		System.out.print("소요시간 2:" + (System.currentTimeMillis() - startTime));
	}

}
