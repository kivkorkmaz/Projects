
public class Games {
	String name;
	int year;
	String type;
	int price;
	
	public Games() {
		
	}

	
	public Games(String name, String type, int price) {
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	
	public Games(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
public static void main(String[] args) {
	
	Games game1 = new Games();
	game1.name = "God Of War";
	game1.price = calculateGamePrice(15);
	game1.type = "Fight";
	game1.year = 2003;
	
	Games game2 =new Games("GTA IV", 2019);
	
	Games game3 = new Games("Football Manager 2022", "Sport", calculateGamePrice(23));
	
	System.out.println(game2.name + " " + game2.year);
	System.out.println(game3.name + " "  + game3.type + " " + game3.price);
	System.out.println(game1.price);
	
	
	}

	public static int calculateGamePrice(int money) {
		int convert = money * 18;
		return convert;
	}
	
}
