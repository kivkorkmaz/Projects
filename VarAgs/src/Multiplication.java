
public class Multiplication {
	public int multiply(int...numbers) {
		int result = 1;
		for(int number : numbers) {
			result = result * number;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Multiplication mult = new Multiplication();
		int mult1 = mult.multiply(35,450);
		System.out.println(mult1);

	}

}
