
public class Sum {
	public int sumNumber (int... args) {
		 int sum = 0;
		 for(int x: args) {
			 sum += x;
		 }
		 return sum;
	}
	public static void main( String[] args ) {
        Sum ex = new Sum();

        int sum2 = ex.sumNumber(2, 4);
        System.out.println("toplam = " + sum2);

        int sum3 = ex.sumNumber(1, 3, 5);
        System.out.println("toplam = " + sum3);
	}
}