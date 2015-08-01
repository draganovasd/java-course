package Stock;

public abstract class Stock {
	private double price;
	private boolean inStock;
	
	public Stock(){
		this.price=0;
		this.inStock=true;
	}
	public Stock(double price, boolean inStock){
		this();
		setPrice(price);
		setInStock(inStock);
	}	
	
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return this.price;
	}
	public void setInStock(boolean inStock){
		this.inStock=inStock;
	}
	public boolean getInStock(){
		return this.inStock;
	}
	

}
