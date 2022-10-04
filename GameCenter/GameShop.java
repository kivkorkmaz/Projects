public class GameShop {
	public static void main(String[] args) {
		Game game = new Game();
		game.name = "God Of War";
		game.price = randomGeneratorNumber(1000,2000);
		game.type = "Mthology";
		game.online = "Not Online";
		System.out.println("Oyunun Adı: " + game.name + " Fiyatı: " + game.price + "TL" + " oyun türü: " + game.type + " online: " + game.online);
		Game game1 = new Game();
		game1.name = "GTA5";
		game1.price = randomGeneratorNumber(1001,2001);
		game1.type = "Guns";
		game1.online = "Online";
		System.out.println("Oyunun Adı: " + game1.name + " Fiyatı: " + game1.price + "TL" + " oyun türü: " + game1.type + " online: " + game1.online);
		
		Customer customer = new Customer();
		customer.name = "Kıvanç Korkmaz";
		customer.age = 25;
		customer.sex = "Erkek";
		customer.mail = "kivanckrkmz1905@hotmail.com";
		System.out.println("Müşteri Adı: " + customer.name + " yaşı: " + customer.age + " cinsiyeti " + customer.sex + " mail adresi " + customer.mail);
	}
		
	public static int randomGeneratorNumber(int rangeMax, int rangeMin) {
		if(rangeMax%2==0 && rangeMin%2==0) {
			return (int) (Math.random()*(rangeMax-rangeMin)) + rangeMin;
		}
		return rangeMin;
	}
	public static String randomGeneratorSex() {
		if(Math.random()<0.5) {
			return "Male";
		}else {
			return "Famale";
		}	
	}
	
}
