
public class CigKofteciShop {

	public static void main(String[] args) {

		CigKofteci menu1 = new CigKofteci();
		menu1.name="Aile Boyu";
		menu1.vegan= randomVegan();
		menu1.setPrice(100);
		
		System.out.println("Menünün adı: " + menu1.name + " Vegan: " + menu1.vegan + 
				" fiyat: " +menu1.getPrice());
		
		CigKofteci menu2 = new CigKofteci();
		menu2.name="Mega Dürüm";
		menu2.vegan= randomVegan();
		menu2.setPrice(50);
		System.out.println("Menünün adı: " + menu2.name + " Vegan: " + menu2.vegan + 
				" fiyat: " +menu2.getPrice());
		
		
	}

	public static String randomVegan() {
		if(Math.random()<0.5) {
			return "Vegan Değil";
		}else {
			return "Vegan";
		}	
	}
}
