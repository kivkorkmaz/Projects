
public class Avarage {

	public static void main(String[] args) {
		avarage(8,9);
		avarage(9,8,150);

	}
	
	public static void avarage(int...s) {
		double avg = 0;
		for(int num : s) {
			avg += num;
		}
			
		avg = avg / s.length;
			System.out.println("Sayıların ortalamsı : " + avg);
		
	}
	
}

	