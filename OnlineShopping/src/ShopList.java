import java.util.Iterator;

public class ShopList {

	public static void main(String[] args) {
		
		//kampanyaları oluştur
		Company[] companyRows = new Company[3];
		
		
		for (int i = 0; i < 3; i++) {
			Company comp1 = new Company();
			comp1.compPrice = randomGeneratorPrice(50, 500);
			comp1.compId = randomGeneratorNumber(1000, 3000);
			comp1.compName = randomCompName();
			companyRows[i] = comp1;
			System.out.println("Kampanyanın Adı : " + companyRows[i].compName + " Kampanyanın ID'i : " + companyRows[i].compId + " Kampanya fiyatı : " + companyRows[i].compPrice);
		}
		
		
		//Customer'ı oluştur.
		Customer[] customerRows = new Customer[10];
		for (int j = 0; j < 10; j++) {
			Customer customer = new Customer();
			customer.customerAge=randomGeneratorNumber(1, 80);
			customer.customerId=randomGeneratorNumber(1000000, 9999999);
			customerRows[j] = customer;
		}
		
		for (int k = 0; k < customerRows.length; k++) {
			assingACamapignToCustomer(customerRows[k],companyRows);
		}

 
	}

	private static void assingACamapignToCustomer(Customer customer, Company[] companyRows) {
		if(customer.customerAge>0 && customer.customerAge<=25) {
			customer.campaign=findCampaign("Genç Kampanya",companyRows);
		}else if(customer.customerAge>25 && customer.customerAge<45) {
			customer.campaign=findCampaign("Erişkin Kampanya",companyRows);
		}else {
			customer.campaign=findCampaign("Herşey Dahil Kampanya",companyRows);
		}
		if(customer.campaign != null) {
			System.out.println(customer.customerId + " TCKN li kişi " + customer.campaign.compName + " kampanyası " + customer.campaign.compPrice + " fiyata seçti.");
		}
		
		
	}

	private static Company findCampaign(String inputCampaignName,Company[] companyRows) {
		for(int i=0; i<companyRows.length;i++) {
			if(inputCampaignName.equals(companyRows[i].compName)) {
				return companyRows[i];
			}
		}
		return null;
	}

	public static double randomGeneratorPrice(double rangeMin, double rangeMax) {
		double randomPrice = (double) (Math.random() * (rangeMax - rangeMin)) + rangeMin;
		return randomPrice;
	}

	public static String randomCompName() {
		if (Math.random() < 0.3) {
			return "Genç Kampanya";
		} else if (Math.random() < 0.6) {
			return "Erişkin Kampanya";
		} else {
			return "Herşey Dahil Kampanya";
		}
	}
	

	public static int randomGeneratorNumber(int rangeMin, int rangeMax) {
		int randomId = (int) (Math.random() * (rangeMax - rangeMin)) + rangeMin;
		return randomId;
	}

}
