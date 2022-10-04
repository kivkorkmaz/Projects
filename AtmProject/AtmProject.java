package deneme.kivanc;

import java.util.Scanner;

public class AtmProject {
	public static void main(String[] args) {
		int bakiye = 1000, input, miktar;
		Scanner scan = new Scanner(System.in);
		System.out.println("Korkmaz Bank'a Hoşgeldiniz");
		System.out.println("Güncel Bakiyeniz: " +  bakiye + " TL");
		while(bakiye>0) {
			System.out.println();
			System.out.println("1-) Para Yatır");
			System.out.println("2-) Para Çek");
			System.out.println("3-) Bakiye Sorgula");
			System.out.println("4-) Çıkış Yap");
			System.out.println("Yapmak İstediğiniz İşlemi Seçin: ");
			input = scan.nextInt();
			
			if(input == 1) {
				System.out.println("Yatırmak İstediğiniz Miktar: ");
				miktar = scan.nextInt();
				bakiye += miktar;
			} else if(input == 2) {
				System.out.println("Çekmek İstediğiniz Miktar: ");
				miktar = scan.nextInt();
				if(miktar > bakiye ) {
					System.out.println("Hatalı işlem Yaptınız");
				}else {
					bakiye -= miktar;
				}
			} else if(input == 3) {
					System.out.println("Güncel Bakiyeniz: " + bakiye + "TL1");
			}else { 
				System.out.println("Çıkış Yapılıyor.");
				break;
			}
			
		}
		
			
	
	}
}