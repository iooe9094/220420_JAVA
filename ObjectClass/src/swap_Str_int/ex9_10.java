package swap_Str_int;

public class ex9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int를 String으로 변환 1
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; // int를 String으로 변환 2
		
	    double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
	    double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
	    
	    System.out.println(String.join("", strVal, "+", strVal2, "=")+sum);
	    System.out.println(strVal + "+" + strVal2 + "=" + sum2);

	}

}
