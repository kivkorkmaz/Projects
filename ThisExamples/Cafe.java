public class Cafe {
	String name;
	String 	type;
	int price;
	
	public Cafe() {
		
	}
	
	public Cafe(String name,String type,int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public Cafe(String name,int price) {
		
		this.name = name;
		this.price = price;
	}
	
	public static void main(String[] args) {
		Cafe food = new Cafe();
		food.name = "Kebap";
		food.type =  "Yiyecek";
		food.price = calculatePrice(5,5);
		System.out.println(food.price);
		
	}
	
	
	public static int calculatePrice(int sayi1, int sayi2) {
		int var1 = sayi1 * 3;
		int var2 = sayi2 * 12;
		int multicaple = var1 * var2;
		return multicaple;
		
	}
	
	
	
	
}
