package String;

public class ex9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주소도 같고 값도 같으면 얇은 복사(swallow copy)
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
		// 주소값 비교 : ==
		System.out.println("str1 == str2 ? " + (str1 == str2));
		
		// 값 비교 : equals()
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();
		
		// new 연산자로 생성하면 주소값이 달라짐
		// 주소는 다르고 값은 같으면 깊은 복사(deep copy)
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + (str3.equals(str4)));

	}

}
