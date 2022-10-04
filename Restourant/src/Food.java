
public class Food {
	String name;
	int price;
	private String culture;
	private boolean vegan;
	String tur;

	public Food() {

	}

	public Food(String name, boolean vegan, int price) {
		this.name = name;
		this.vegan = vegan;
		this.price = price;
		
	}
	
	public Food(String culture) {
		this.culture = culture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCulture() {
		return culture;
	}

	public void setCulture(String culture) {
		this.culture = culture;
	}

	public boolean getVegan() {
		return vegan;
		
	}

	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	
	
	
}
