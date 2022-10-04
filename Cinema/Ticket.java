
public class Ticket {
	public String name;
	public int price;
	public int no;
	public boolean stock;

	
	 public Ticket(){
		 
	 	}
	 
	 public Ticket(String name, int price) {
		 
		 this.name = name;
		 this.price = price;
		 
		 
	 }
	 
	 public Ticket(boolean stock,int no) {
		 this.stock = stock;
		 this.no = no;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}
	 

}