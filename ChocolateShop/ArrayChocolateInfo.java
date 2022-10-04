package deneme.kivanc;

import java.text.DecimalFormat;

public class ArrayChocolateInfo {
	private static final DecimalFormat df = new DecimalFormat("0.00");

		public static void main(String[] args) {
			ArrayChocolate[] chocolateRows =new ArrayChocolate[5];
			ArrayChocolate chocolate = new ArrayChocolate();
			for(int i=0; i<5; i++) {
	//			chocolate.barcod = randomGeneratorBarcod(10000,100000);
	//			chocolate.price = randomGeneratorPrice(1,2);
				chocolate.barcod = (int)randomGenerator(10000,100000);
				chocolate.price = randomGenerator(1,2);
				chocolate.expiration = randomGeneratorExpiration();
				chocolateRows[i] = chocolate;
				System.out.println("Chocolate Barcod : " + chocolateRows[i].barcod + " Chocolate Price : " + df.format(chocolate.price) + " Chocolate Exparation : " + chocolateRows[i].expiration );
				
			}
		}

	public static int randomGeneratorBarcod(int rangeMin, int rangeMax) {
		int randomNumber = (int) (Math.random()*(rangeMax-rangeMin)) + rangeMin;
		return randomNumber;
		
	}
	
	public static double randomGeneratorPrice(double rangeMin, double rangeMax) {
		double randomPrice = (double) (Math.random()*(rangeMax-rangeMin)) + rangeMin;
		return randomPrice;
	}
	
	public static double randomGenerator(double rangeMin, double rangeMax) {
		return (double) (Math.random()*(rangeMax-rangeMin)) + rangeMin;
	}
	
	public static String randomGeneratorExpiration() {
		if(Math.random()<0.5) {
			return "Yanlış";
		}else {
			return "Doğru";
		}		
	}
}
