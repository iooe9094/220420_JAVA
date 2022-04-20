package WrapperClass;

public class ex9_14 {

	public static void main(String[] args) {
		
		// int, float, double, char, boolean
		// String, wrapper-class equals : 내부적으로 오버라이딩 되어 있음
		// 개발자가 오버라이딩 할 필요 없음
		
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i==i2 ? " + (i==i2)); // 주소값 비교
		System.out.println("i.equals(i2) ? " + i.equals(i2));
		// compare to : 같으면 0 크면 1 작으면 -1
		System.out.println("i.compareTo(i2) = " + i.compareTo(i2)); // 0
		System.out.println("i.toString()= " + i.toString()); // 문자열 100
		
		// INTEGER 최대 표현할 수 있는 값(양수)
		System.out.println("MAX_VALUE= " + Integer.MAX_VALUE);
		// INTEGER 최소 표현할 수 있는 값(음수)
		System.out.println("MIN_VALUE= " + Integer.MIN_VALUE);
		// SIZE : bit 표현할 수 있는 범위 32bit
		System.out.println("SIZE= " + Integer.SIZE + " bits");
		// BYTES : byte 표현할 수 있는 범위 4byte
		System.out.println("BYTES= " + Integer.BYTES + " bytes");
		// TYPE : 자료형 int
		System.out.println("TYPE= " + Integer.TYPE);

	}

}
