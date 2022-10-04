package deneme.kivanc;

import java.util.Scanner;

public class FlyTickets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int km,yas,tip;
		System.out.println("Mesafeyi Girin: ");
		km = scan.nextInt();
		System.out.println("\nYaşınızı Girin: ");
		yas = scan.nextInt();
		System.out.println("\nYolculuk Tipini Seçiniz(1=Tek Gidiş , 2=Gidiş/Dönüş)");
		tip = scan.nextInt();
		
		double normalFiyat,yasIndirimi,tipIndirimi;
		
		if(km > 0 && yas>0 && (tip==1 | tip==2)) {
			normalFiyat = km * 0.10;
			if(yas < 12) {
				yasIndirimi = normalFiyat * 0.5;
			}else if(yas>= 12 && yas<=24 ) {
				yasIndirimi = normalFiyat * 0.10;
			}else if(yas >= 65) {
				yasIndirimi = normalFiyat * 0.30;
			}else {
				yasIndirimi = normalFiyat;
			}
			
			if(tip == 2) {
				tipIndirimi = normalFiyat * 0.20;
				normalFiyat = (normalFiyat - tipIndirimi) * 2;
			}
			System.out.println("Bilet Tutarı: " + normalFiyat + "TL'dir" );
		}else{
			System.out.println("Hatalı Bilgi Girdiniz");
		}
	}
}