
public class CigKofteci {
	String name;
	double price;
	String vegan;
	
	
	public CigKofteci() {
		
	}
	
	public CigKofteci(String name,double price) {
		this.name = name;
		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String isVegan() {
		return vegan;
	}

	public void setVegan(String vegan) {
		this.vegan = vegan;
	}
	
	
	
	
	
	
}
