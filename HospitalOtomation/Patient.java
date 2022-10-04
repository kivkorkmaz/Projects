
public class Patient {
	String name;
	String ill;
	int tckno;
	int age;
	public Patient() {
		
	}
	
	public Patient(String name, final int age ) {
		this.name = name;
		this.age = age;
		
	}
	public Patient(String name, int age, int tckno, String ill) {
		this.name = name;
		this.age = age;
		this.tckno = tckno;
		this.ill = ill;
	}
	
}
