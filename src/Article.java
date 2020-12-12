
public class Article  {
	private String name;
	private double buyPrice,sellPrice;
	private int stock;
	
	
	
	public Article(String name, double buyPrice,double sellPrice) {
		
		this.setName(name);
		this.buyPrice=buyPrice;
		this. sellPrice=sellPrice ;
		this.stock=0;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public double  getBuyPrice() {
		return buyPrice;
	}
	
public  void setBuyPrice(double buyPrice) {
		
		
		this.buyPrice=buyPrice;
		
	}
	
	public double getSallPrice() {
		return sellPrice;
	}
	

public void setSallPrice(double SallPrice) {
		
		
		this.sellPrice= SallPrice;
		
	}
	
	
	public int  getStock() {
		return stock ;
	}
public void setStock(int stock ) {
		
		
		this.stock=stock;
}



	
		

}

