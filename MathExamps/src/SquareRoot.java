import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kökünü Almak İstediğiniz Sayıyı Yazın: ");
		int sayi;
		sayi = scan.nextInt();
		if(sayi<0) {
			System.out.println("0 ve Negatif Sayıların Karekökü Alınmaz");
		}else
			System.out.println("Sayının Karekökü: " + Math.sqrt(sayi));

	}

}
