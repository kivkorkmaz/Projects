import java.util.Scanner;

public class MathMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("İlk Sayıyı Giriniz: ");
		double a;
		double b;
		a = scan.nextDouble();
		System.out.println("İkinci Sayıyı Giriniz: ");
		b = scan.nextDouble();
		if(a>b) {
			System.out.println("ilk Yazdığınız Sayı Daha Büyük");
		}else {
			System.out.println("Son Yazdığınız Sayı Daha Büyük.");
		}
		System.out.println("İki Sayı Arasında En Büyü Olanı: " + Math.max(a, b));

	}

}
