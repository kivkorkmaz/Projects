package deneme.kivanc;

import java.util.Scanner;

public class CalculateNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.println("İlk Sayıyı Giriniz: ");
		sayi1 = scan.nextInt();
		System.out.println("İkinci Sayıyı Giriniz: ");
		sayi2 = scan.nextInt();
		System.out.println("Lütfen Yapmak İstediğini İşlemi Seçiniz: ");
		System.out.println("1.Toplama 2.Çıkarma 3.Çarpma 4.Bölme");
		System.out.println("Seçiniz: ");
		secim = scan.nextInt();
		if(secim == 1) {
			System.out.println("Toplama: "+ (sayi1 + sayi2));
		}else if(secim==2) {
			System.out.println("Çıkarma: "+ (sayi1 - sayi2));	
		}else if(secim==3) {
			System.out.println("Çarpma: " + (sayi1 * sayi2));
		}else {
			System.out.println("Bölme: " + (sayi1 / sayi2));
		}
		
	}

}
