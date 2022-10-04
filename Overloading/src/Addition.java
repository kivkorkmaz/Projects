public class Addition {
	static int add(int a, int b) {
		return a + b;
	}
	static double ad(int a, int b,double c) {
		return a + b + c;
	
	}
	static double ad(int a,int b, int c, int d) {
		return a + b + c + d;
	}
	static int ad(int a, int b) {
		return a + b;
	}
	
	public static void main(String [] args) {
		System.out.println(ad(2,5,2.5));
		System.out.println(ad(2,5,8,9));
		System.out.println(ad(2,5));
	}
}
