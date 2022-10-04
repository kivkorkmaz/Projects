import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ProductsInfo {

	public static void main(String[] args) {
		System.out.println("Ürünleri Giriniz: ");
		String[] arr = new String[5];
		Scanner scan = new Scanner(System.in);
		
		Product pr = new Product(null, 0, 0);
		Product p1;	
		p1= new Product(null, 0, 0);
		int sayac =1;
		int barkod;
		double fiyat,indirimliFiyat;
		String isim;
		for(String p : arr ) {
			System.out.println(" ");
			System.out.println(sayac + ". Ürünü Giriniz: ");
			arr[sayac - 1] = scan.nextLine();
			sayac++;
		}
		Product[] arrProduct = new Product[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			Product product;
			if(randomTrueValue() == true) {
				barkod = randomNumberGenerator();
				fiyat = randomNumberGenerator(100,200);
				indirimliFiyat = randomDiscountedPrice(fiyat);
				isim = arr[i] ;	
				product = new Product(isim,indirimliFiyat,fiyat,barkod);
				System.out.println("Ürünün adı: " + product.name + "İndirimli Fiyatı: "
						+ "" + product.discountedprice + " Normal Fiyatı: " + product.price + ""
								+ "Ürünün Barkodu : " + product.barcode);
				arrProduct[i]=product;
				
			}else {
				barkod = randomNumberGenerator();
				fiyat = randomNumberGenerator(100,200);
				isim = arr[i] ;	
				product = new Product (isim,fiyat,barkod);
				System.out.println("Ürünün adı: " + product.name + 
							" Normal Fiyatı: " + product.price + ""
								+ "Ürünün Barkodu : " + product.barcode);

				arrProduct[i]=product;
			}
			
		}
		
		
		System.out.println("-----------");
		for (int k = 0; k < arrProduct.length; k++) {
			if(arrProduct[k].discountedprice != 0.0) {
				System.out.println(arrProduct[k].discountedprice);
			}
			
		}
		
		
	}
	public static int randomNumberGenerator() {
		int generateBarcodeNumber = (int) (Math.random() * (1000000 - 100000)) + 100000;
		return generateBarcodeNumber;
	}
	public static double randomNumberGenerator(int rangeMin, int rangeMax) {
		return (double) (Math.random() * (rangeMax - rangeMin)) + rangeMin;
	}
	
	public static boolean randomTrueValue() {
		if(Math.random()<0.5) {
			return true;
		}else {
			return false;
		}
	}
	public static double randomDiscountedPrice(double price) {
		double rangeMax,rangeMin;
		rangeMax = price - price * 0.10;
		rangeMin = price - price * 0.20;
		return (double) (Math.random() * (rangeMax - rangeMin)) + rangeMin;
		
	}
}

