package emptyString;

public class ex9_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 길이가 0인 배열을 생성
		char[] cArr = new char[0]; // char[] cArr = {};
		String s = new String(cArr); // String s = new String("");
		
		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@"+s+"@@@");

	}

}
