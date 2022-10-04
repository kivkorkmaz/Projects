
public class Human {
	String name;
	int age;
	int height;
	double weight;
	
	public Human() {
		
	}
	
	
	public Human(String name,int age, double weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
	}


public static void main (String [] args) {
	Human ali = new Human();
	ali.age=23;
	ali.name="Ali";
	ali.height=180;
	ali.weight=85.5;
	
	Human kivanc = new Human("Kivanc", 26, 88.6);
	
	System.out.println(kivanc.name+ " " + kivanc.age+ " " + kivanc.weight);
	System.out.println(ali.age + ali.name);
	}
	
}