import java.util.Scanner;

public class MathPow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Taban Sayıyı Giriniz: ");
		double taban;
		double us;
		taban = scan.nextInt();
		System.out.println("Üssü Giriniz: ");
		us = scan.nextInt();
		System.out.println(taban + " sayının üssü= " + Math.pow(taban, us));
	}

}
