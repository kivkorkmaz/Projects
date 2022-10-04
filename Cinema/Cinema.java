
public class Cinema {

	public static void main(String[] args) {
		Ticket customer = new Ticket();
		customer.setName("Lord Of The Rings");
		customer.setNo(1);
		System.out.println("Filmin Adı: " + customer.getName() + "\nBilet Numarası: " + customer.getNo());
	
		Ticket customer1 = new Ticket();
		customer1.setName("Deli Yürek");
		customer1.setNo(2);
		customer.setPrice(randomNumb(1,15));
//		customer1.price = randomNumb(1,15);
//		customer1.price = randomNumber(1,15);
		System.out.println("Filmin Adı: " + customer1.getName() + "\nBilet Numarası: " + customer1.getNo()
		+" Bilet Ücreti: " +  customer1.price);

	
	
	}

		 public static int randomNumb(int x, int y) {
			return(int) (Math.random()*(y-x)) + x;
			 
		 }
		 
		 public int randomNumber(int x, int y) {
				return(int) (Math.random()*(y-x)) + x;
				 
			 }
	
	

	
	
	
}
