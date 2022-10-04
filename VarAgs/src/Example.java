
public class Example {
	public static void scan(int num, String...values) {
		System.out.println("Sayı: " + num);
		for(String s : values)
			System.out.println(s);
	}

	public static void main(String[] args) {
		scan(44,"Malatya");
		scan(56456,"asdfasdfcasdf","asdkjhasjkd");
		scan(445344,"sdc sdcsdcsdc");
		scan(44242,"kdsfjdhjd");
		scan(4544,"dflkjdklfkds");
	}

}
