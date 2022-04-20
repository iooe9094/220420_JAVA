package equals_override;

public class ex9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
	}
}

class Person {
	long id;
	
	// equals() override
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
		} else 
			return false;
		}
		
		Person(long id) {
			this.id = id;
		}
	}
