package join_StringJoiner;

import java.util.StringJoiner;

public class ex9_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		// 각각의 문자를 구분자(-)를 이용해서 붙임
		// 첫 번째 매개변수 : 구분자
		// 두 번째 매개변수 : 배열
		System.out.println(String.join("-", arr));
		
		// 첫 번째 매개변수 : 구분자
		// 두 번째 매개변수 : 첫 문자열에 붙일 문자
		// 세 번째 매개변수 : 마지막 문자열에 붙일 문자
		StringJoiner sj = new StringJoiner("/", "[" , "]");
		
		for(String s : arr) {
			// StringJoiner 클래스의 문자열 붙이기 메소드
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}
