
public class Menu {

	public static void main(String[] args) { 
		Food food = new Food("Kebab",true, 100);
		System.out.println("İsim:" + food.name + " türü " + food.getVegan() + " \nFiyatı " + food.price + "TL"
				+ " \nYemeğin ilk harfi: " + food.name.charAt(0));
		System.out.println(" ");

		Food food1 = new Food("Türk Mutfağı'na");
		food1.setCulture("Adana'ya");
		System.out.println(food1.getCulture() + " aittir");
		System.out.println(" ");

		Drinks drinks = new Drinks("Raki", "Alkollü", 580);
		drinks.setPrice(250);
		System.out.println("İçecek Adı " + drinks.name + " \nTürü " + drinks.getAlchol().toUpperCase() + " fiyatı "
				+ drinks.getPrice() + "TL");

		Drinks drinks1 = new Drinks("Şarap", "Alkollü", 305);
		drinks.setAlchol("Alkolsüz");
		System.out.println("İçecek Adı " + drinks1.name + " \nTürü " + drinks1.getAlchol().toUpperCase() + " fiyatı "
				+ drinks1.getPrice() + "TL" + " " + Math.sqrt(drinks1.getPrice()) + "TL");
		
		Food food2 = new Food();
		food2.setName("Tantuni");
		food2.setPrice(64);
		food2.setVegan(true);
		food2.setTur("Vegan");
		System.out.println("İsim : " + food2.getName() + " türü " + food2.getTur() + "\nFiyatı " + food2.getPrice()
				+ "TL" + "\nYemeğin ilk harfi: " + food2.getName().charAt(0));
		
		
		Food food3 = new Food();
		food3.
		
		
		
	}
//	public static boolean vegan(boolean vegan, boolean notVegan) {
//		if(vegan = true) {
//			return vegan;
//		}else {
//			return notVegan;
//		}
//	}
}
