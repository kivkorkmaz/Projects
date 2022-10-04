import java.util.Scanner;

public class Ceil {

	public static void main(String[] args) {
		double sayi;
		Scanner scan = new Scanner(System.in);
		System.out.println("Yuvarlamak İstediğiniz Sayıyı Yazın: ");
		sayi = scan.nextDouble();
		System.out.println("Sayıyı Yuvarlarsak " + Math.ceil(sayi));
		

	}

}
