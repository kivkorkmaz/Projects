
public class Reader {
	String name;
	int age;
	String sex;

	
	public Reader() {
		
	}
	
	public Reader(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Reader(String sex,int age, String name) {
		this(name,age);
		this.sex = sex;
	}
	
	
	
	
}
