package Stock;

public class Deserts extends Stock {
	private String cake;
	private String iceCream;
	
	public Deserts(){
		super();
		this.cake="";
		this.iceCream="";
		
	}
	public Deserts(double price, boolean inStock,String cake, String iceCream){
		super(price,inStock);
		setCake(cake);
		setCream(iceCream);
	}
	public void setCake(String cake){
		this.cake=cake;
	}
	public String getCake(){
		return this.cake;
	}
	public void setCream(String iceCream){
		this.iceCream=iceCream;
	}
	public String getCream(){
		return this.iceCream;
	}
	public static void main(String[] args) {
	

	}

}
