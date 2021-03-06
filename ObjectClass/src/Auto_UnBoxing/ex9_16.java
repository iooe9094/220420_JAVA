package Auto_UnBoxing;

public class ex9_16 {

	public static void main(String[] args) {
		
		// AutoBoxing : 기본형 값을 래퍼 클래스의 객체로 자동 변환해주는 것
		// UnBoxing : 반대로 변환(수동)하는 것
		int i = 10;
		
		// 기본형을 참조형으로 형변환(형변환 생략 가능)
		Integer intg = (Integer)i; // Integer intg = Integer.valueOf(i)
		Object obj = (Object)i; // Object obj = (Object)Integer.valueOf(i)
		
		Long lng = 100L; // Long lng = new Long(100L)
		
		int i2 = intg + 10; // 참조형과 기본형간의 연산 가능
		long l = intg + lng; // 참조형 간 덧셈 가능
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2; // 참조형을 기본형으로 형변환도 가능 (형변환 생략 가능)
		
		Integer intg3 = intg2 + i3;
		
		System.out.println("i = " + i);
		System.out.println("intg = " + intg);
		System.out.println("obj = " + obj);
		System.out.println("lng = " + lng);
		System.out.println("intg + 10 = " + i2);
		System.out.println("intg + lng = " + l);
		System.out.println("intg2 = " + intg2);
		System.out.println("i3 = " + i3);
		System.out.println("intg2 + i3 = " + intg3);

	}

}
