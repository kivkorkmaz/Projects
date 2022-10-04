
public class Employee {
	String name;
	int id;
	String depertmant;
	double wage;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String depertmant) {
		this.id = id;
		this.name = name;
		this.depertmant = depertmant;
	}
	
	public Employee(int id, double wage) {
		this.id = id;
		this.wage = wage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepertmant() {
		return depertmant;
	}

	public void setDepertmant(String depertmant) {
		this.depertmant = depertmant;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
		
	
	
	
}
