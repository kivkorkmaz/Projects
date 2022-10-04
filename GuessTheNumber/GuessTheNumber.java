package deneme.kivanc;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Random rastgele = new Random();
		int rastgeleSayi, tahmin, tahminHakki, puan=0, yanlisTahmin;
		rastgeleSayi = rastgele.nextInt(100);
		System.out.print("Tahmin Hakkınız : ");
		tahminHakki = input.nextInt();
		for (int i=1; i<=tahminHakki; i++) {
			yanlisTahmin = i-1;  
			System.out.print(i+". Tahmininiz : ");
			tahmin = input.nextInt();
			if (tahmin<0 || tahmin>100) {
				System.out.println("Lütfen 0-100 arasında bir tahmin yapınız!");
				continue;
			}
			if (tahmin==rastgeleSayi) {
				System.out.println("Tebrikler! Doğru sonucu buldunuz.");
				puan = 100-((yanlisTahmin)*(100)); 
				break;
			} else if(tahmin>rastgeleSayi) {
				System.out.println("Aşağı!!!");
			} else {
				System.out.println("Yukarı!!!");
			}
			if (i==tahminHakki) {
				System.out.println("Tahmin hakkınız bitti! Sayı "+rastgeleSayi+" idi.");
			}
		}
		System.out.println("Puanınız : "+puan);
	}


}
