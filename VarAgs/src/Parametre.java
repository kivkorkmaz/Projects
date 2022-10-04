
public class Parametre {

	static void parametre(int... a) {
		System.out.println("Parametre Sayısı: " + a.length);
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String args[]) {

		parametre(100);

		parametre(15, 26, 3, 86);

		parametre();

	}
}
