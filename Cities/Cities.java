package deneme.kivanc;

public class Cities {

	public static void main(String[] args) {
		String [] [] sehirler = new String [3] [4];
 		
		sehirler [0] [0] = "İstanbul";
		sehirler [0] [1] = "Bursa";
		sehirler [0] [2] = "Bilecik";
		sehirler [1] [0] = "Ankara";
		sehirler [1] [1] = "Konya";
		sehirler [1] [2] = "Kayseri";
		sehirler [2] [0] = "Diyarbakır";
		sehirler [2] [1] = "ŞanlıUrfa";
		sehirler [2] [2] = "GaziAntep";
	
		for (int i=0;i<=2;i++) {
			System.out.println("-------------------");
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		

	}

}
