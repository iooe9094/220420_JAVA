package equals;

public class ex9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다");
		} else {
			System.out.println("v1과 v2는 다릅니다");
			// equals는 주소값으로 비교하므로 다르다고 나옴
		}
	}
}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}