
public class Drinks {
	String name;
	private int price;
	String culture;
	private String alchol;

	public Drinks(String name, String alchol, int price) {
		this.name = name;
		this.alchol = alchol;
		this.price = price;
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

	public String getAlchol() {
		return alchol;
	}

	public void setAlchol(String alchol) {
		this.alchol = alchol;
	}

	public Drinks() {

	}

}
