public class Product {
	String name;
	int barcode;
	double price;
	double discountedprice;


	public Product(String name, double price, int barcode) {
		this.barcode = barcode;
		this.price = price;
		this.name = name;
	
	}
	
	public Product(String name,double discountedprice,double price,int barcode) {
		this.barcode = barcode;
		this.discountedprice = discountedprice;
		this.price = price;
		this.name = name;
		
	}
	
}